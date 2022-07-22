package com.stock.management.management.web.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDTO {
    private Integer customerId;
    private Timestamp order_date;
}
