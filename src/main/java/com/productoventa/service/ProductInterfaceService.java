package com.productoventa.service;

import com.productoventa.dto.ProductDto;

import java.util.List;

public interface ProductInterfaceService {
    ProductDto save(ProductDto productDto);
    ProductDto findById(Long id);
    List<ProductDto>findAll();
    Boolean delete(Long id);
}
