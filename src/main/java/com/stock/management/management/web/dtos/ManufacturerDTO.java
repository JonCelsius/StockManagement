package com.stock.management.management.web.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturerDTO {
    private String name;
    private String originCountry;
    private float manufacturerRating;
}
