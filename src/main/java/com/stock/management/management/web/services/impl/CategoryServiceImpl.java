package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.CategoryDTO;
import com.stock.management.management.web.entities.Category;
import com.stock.management.management.web.mappers.CategoryMapper;
import com.stock.management.management.web.repositories.CategoryRepository;
import com.stock.management.management.web.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void save(CategoryDTO categoryDTO) {

        categoryRepository.save(categoryMapper.dtoToEntity(categoryDTO));
    }

    @Override
    public List<CategoryDTO> getAll() {

        List<Category> categoryList = categoryRepository.findAll();

        return categoryList.stream().map(category -> categoryMapper.entityToDTO(category)).collect(Collectors.toList());
    }

    @Override
    public Category getByName(String categoryName) {
        return categoryRepository.getByName(categoryName).orElseThrow(() ->
                new IllegalArgumentException("Category with that name" + categoryName +" does not exist"));
    }
}
