package com.stock.management.management.web.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineDTO {
    private Integer productId ;
    private Integer quantity;
    private Integer orderId;



}
