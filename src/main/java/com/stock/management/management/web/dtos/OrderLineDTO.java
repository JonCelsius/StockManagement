package com.stock.management.management.web.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineDTO {
    private ProductDTO product;
    private int quantity;
    private OrdersDTO orders;



}
