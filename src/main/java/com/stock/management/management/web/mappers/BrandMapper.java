package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.BrandDTO;
import com.stock.management.management.web.entities.Brand;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {

    public Brand dtoToEntity(BrandDTO brandDTO) {
        Brand brand = new Brand();
        brand.setName(brandDTO.getName());
        return brand;
    }

    public BrandDTO entityToDTO(Brand brand){
        return new BrandDTO(brand.getName());
    }
}
