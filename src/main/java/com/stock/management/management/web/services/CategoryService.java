package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.CategoryDTO;
import com.stock.management.management.web.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    void save(CategoryDTO categoryDTO);
    List<CategoryDTO> getAll();

    Category getByName(String categoryName);
}
