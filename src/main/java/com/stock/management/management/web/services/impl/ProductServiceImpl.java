package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.ProductDTO;
import com.stock.management.management.web.entities.Product;
import com.stock.management.management.web.mappers.ProductMapper;
import com.stock.management.management.web.repositories.ProductRepository;
import com.stock.management.management.web.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(ProductDTO productDTO) {
        productRepository.save(productMapper.dtoToEntity(productDTO));
    }

    @Override
    public List<ProductDTO> getAll() {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(product ->
                productMapper.entityToDTO(product)).collect(Collectors.toList());
    }
}
