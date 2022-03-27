package com.productoventa.service.mapper;

import com.productoventa.dto.CategoryDto;
import com.productoventa.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mappings({
            @Mapping(source = "id", target = "categoryId"),
            @Mapping(source = "nombre", target = "name"),
    })
    CategoryDto toCategoryDto(Categoria categoria);

    List<CategoryDto> toCategoryDtos(List<Categoria> categorias);

    @InheritInverseConfiguration
    Categoria toCategoria(CategoryDto categoryDto);
}
