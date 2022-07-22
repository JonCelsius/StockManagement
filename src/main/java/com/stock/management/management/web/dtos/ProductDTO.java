package com.stock.management.management.web.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private String manufacturerName;
    private String brandName;
    private String categoryName;
    private double price;

}
