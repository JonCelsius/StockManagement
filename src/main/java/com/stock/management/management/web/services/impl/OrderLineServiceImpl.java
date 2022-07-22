package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.OrderLineDTO;
import com.stock.management.management.web.entities.OrderLine;
import com.stock.management.management.web.mappers.OrderLineMapper;
import com.stock.management.management.web.repositories.OrderLineRepository;
import com.stock.management.management.web.services.OrderLineService;
import com.stock.management.management.web.services.OrdersService;
import com.stock.management.management.web.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderLineServiceImpl implements OrderLineService {

    @Autowired
    OrderLineMapper orderLineMapper;

    @Autowired
    OrderLineRepository orderLineRepository;

    @Autowired
    ProductService productService;

    @Autowired
    OrdersService ordersService;

    @Override
    public void save(OrderLineDTO orderLineDTO) {
        OrderLine orderLine = new OrderLine();
        orderLine.setProduct(productService.getById(orderLineDTO.getProductId()));
        orderLine.setOrders(ordersService.getById(orderLineDTO.getOrderId()));
        orderLineRepository.save(orderLine);
    }

    @Override
    public List<OrderLineDTO> getAll() {
        List<OrderLine> orderLineList = orderLineRepository.findAll();
        return orderLineList.stream().map(orderLine ->
                orderLineMapper.entityToDTO(orderLine)).collect(Collectors.toList());
    }
}
