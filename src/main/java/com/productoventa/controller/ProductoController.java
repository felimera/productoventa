package com.productoventa.controller;

import com.productoventa.dto.ProductDto;
import com.productoventa.service.ProductInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/productos")
public class ProductoController {
    @Autowired
    private ProductInterfaceService productInterfaceService;

    @GetMapping(path = "/findall")
    public ResponseEntity<List<ProductDto>> findAll() {
        return ResponseEntity.ok(productInterfaceService.findAll());
    }
}
