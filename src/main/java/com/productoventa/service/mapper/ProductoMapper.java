package com.productoventa.service.mapper;

import com.productoventa.dto.ProductDto;
import com.productoventa.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = CategoriaMapper.class)
public interface ProductoMapper {
    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "imagen", target = "picture"),
            @Mapping(source = "categoria", target = "category")
    })
    ProductDto toProductDto(Producto producto);

    List<ProductDto> toProductDtos(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(ProductDto productDto);
}
