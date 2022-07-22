package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.ProductDTO;
import com.stock.management.management.web.entities.Product;

import java.util.List;

public interface ProductService {
    void save(ProductDTO productDTO);
    List<ProductDTO> getAll();
    Product getById(int id);

}
