package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.ManufacturerDTO;
import com.stock.management.management.web.entities.Manufacturer;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerMapper {
    public Manufacturer dtoToEntity(ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(manufacturerDTO.getName());
        manufacturer.setOriginCountry(manufacturerDTO.getOriginCountry());
        manufacturer.setManufacturerRating(manufacturerDTO.getManufacturerRating());
        return manufacturer;
    }

    public ManufacturerDTO entityToDTO(Manufacturer manufacturer) {
        return new ManufacturerDTO(manufacturer.getName(),
                manufacturer.getOriginCountry(), manufacturer.getManufacturerRating());
    }
}
