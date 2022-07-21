package com.stock.management.management.web.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private ManufacturerDTO manufacturer;
    private BrandDTO brand;
    private double price;

}
