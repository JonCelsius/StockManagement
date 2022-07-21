package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.CategoryDTO;
import com.stock.management.management.web.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/save")
    public ResponseEntity<String> saveCategory(@RequestBody CategoryDTO categoryDTO) {
        categoryService.save(categoryDTO);

        return new ResponseEntity<>("DONE!!", HttpStatus.OK);

    }

    @GetMapping("/get")
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);

    }

}
