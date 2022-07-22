package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.ProductDTO;
import com.stock.management.management.web.entities.Product;
import com.stock.management.management.web.mappers.ProductMapper;
import com.stock.management.management.web.repositories.ProductRepository;
import com.stock.management.management.web.services.BrandService;
import com.stock.management.management.web.services.CategoryService;
import com.stock.management.management.web.services.ManufacturerService;
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

    @Autowired
    ManufacturerService manufacturerService;

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Override
    public void save(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setManufacturer(manufacturerService.getByName(productDTO.getManufacturerName()));
        product.setBrand(brandService.getByName(productDTO.getBrandName()));
        product.setCategory(categoryService.getByName(productDTO.getCategoryName()));
        productRepository.save(product);
    }

    @Override
    public List<ProductDTO> getAll() {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(product ->
                productMapper.entityToDTO(product)).collect(Collectors.toList());
    }

    @Override
    public Product getById(int id) {
        return  productRepository.getById(id).orElseThrow(() ->
                new IllegalArgumentException("Product with that id" + id +" does not exist"));
    }
}
