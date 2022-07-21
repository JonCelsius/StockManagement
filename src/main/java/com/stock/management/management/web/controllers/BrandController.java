package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.BrandDTO;
import com.stock.management.management.web.entities.Brand;
import com.stock.management.management.web.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    BrandService brandService;

    @PostMapping("/save")
    public ResponseEntity<String> saveBrand(@RequestBody BrandDTO brandDTO) {

        brandService.save(brandDTO);

        return new ResponseEntity<>("DONE!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<BrandDTO>> getBrands() {
        return new ResponseEntity<>(brandService.getAll(), HttpStatus.OK);
    }
}
