package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.ProductDTO;
import com.stock.management.management.web.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
        return new ResponseEntity<>("Your product was saved......OK!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<ProductDTO>> getProducts(){
        return new ResponseEntity<>(productService.getAll(),HttpStatus.OK);
    }
}
