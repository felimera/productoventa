package com.productoventa.service;

import com.productoventa.dto.ProductDto;
import com.productoventa.entity.Producto;
import com.productoventa.repository.ProductoRepository;
import com.productoventa.service.mapper.ProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplementService implements ProductInterfaceService {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ProductoMapper productoMapper;

    @Override
    public ProductDto save(ProductDto productDto) {
        Producto producto = productoRepository.save(productoMapper.toProducto(productDto));
        return productoMapper.toProductDto(producto);
    }

    @Override
    public ProductDto findById(Long id) {
        return productoRepository.findById(id)
                .map(producto -> productoMapper.toProductDto(producto))
                .orElse(null);
    }

    @Override
    public List<ProductDto> findAll() {
        return productoMapper.toProductDtos((List<Producto>) productoRepository.findAll());
    }

    @Override
    public Boolean delete(Long id) {
        return productoRepository.findById(id).map(producto -> {
            productoRepository.delete(producto);
            return Boolean.TRUE;
        }).orElse(Boolean.FALSE);
    }
}
