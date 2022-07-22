package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.ProductDTO;
import com.stock.management.management.web.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    @Autowired
    BrandMapper brandMapper;
    @Autowired
    ManufacturerMapper manufacturerMapper;

    /*public Product dtoToEntity (ProductDTO productDTO){
        Product product=new Product();
        product.setName(productDTO.getName());
        product.setBrand(brandMapper.dtoToEntity(productDTO.getBrand()));
        product.setManufacturer(manufacturerMapper.dtoToEntity(productDTO.getManufacturer()));
        product.setPrice(productDTO.getPrice());
        return product;
    }*/

    public ProductDTO entityToDTO(Product product){
        return new ProductDTO(product.getName(),product.getManufacturer().getName(),
                product.getBrand().getName(),product.getCategory().getName(),product.getPrice());
    }

}
