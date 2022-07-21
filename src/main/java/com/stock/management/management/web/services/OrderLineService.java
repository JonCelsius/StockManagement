package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.OrderLineDTO;

import java.util.List;

public interface OrderLineService {
    void save(OrderLineDTO orderLineDTO);

    List<OrderLineDTO> getAll();
}
