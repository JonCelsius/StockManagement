package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.CategoryDTO;
import com.stock.management.management.web.entities.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category dtoToEntity(CategoryDTO categoryDTO){
        Category category=new Category();
        category.setName(categoryDTO.getName());
        return category;
    }
    public CategoryDTO entityToDTO(Category category){
        return new CategoryDTO(category.getName());
    }
}
