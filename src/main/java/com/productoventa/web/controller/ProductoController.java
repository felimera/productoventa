package com.productoventa.web.controller;

import com.productoventa.dto.ProductDto;
import com.productoventa.service.ProductInterfaceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/productos")
@Api(tags = "Products")
public class ProductoController {
    @Autowired
    private ProductInterfaceService productInterfaceService;

    @GetMapping(path = "/findall")
    @ApiOperation("Get all supermarket product.")
    @ApiResponse(code = 200, message = "Ok")
    public ResponseEntity<List<ProductDto>> findAll() {
        return ResponseEntity.ok(productInterfaceService.findAll());
    }
}
