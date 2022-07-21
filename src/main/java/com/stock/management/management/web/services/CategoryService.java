package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    void save(CategoryDTO categoryDTO);
    List<CategoryDTO> getAll();
}
