package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.OrdersDTO;
import com.stock.management.management.web.entities.Orders;

import java.util.List;

public interface OrdersService {
    void save(OrdersDTO ordersDTO);
    List<OrdersDTO> getAll();

    Orders getById(int orderId);
}
