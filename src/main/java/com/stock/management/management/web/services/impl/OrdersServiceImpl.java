package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.OrdersDTO;
import com.stock.management.management.web.entities.Orders;
import com.stock.management.management.web.mappers.OrdersMapper;
import com.stock.management.management.web.repositories.OrdersRepository;
import com.stock.management.management.web.services.CustomerService;
import com.stock.management.management.web.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    CustomerService customerService;

    @Override
    public void save(OrdersDTO ordersDTO) {
        Orders orders=new Orders();
        orders.setCustomer(customerService.getById(ordersDTO.getCustomerId()));
        orders.setOrderDate(ordersDTO.getOrder_date());
        ordersRepository.save(orders);
    }

    @Override
    public List<OrdersDTO> getAll() {
        List<Orders> ordersList=ordersRepository.findAll();
        return ordersList.stream().map(orders -> ordersMapper.entityToDTO(orders)).collect(Collectors.toList());
    }

    @Override
    public Orders getById(int orderId) {
        return  ordersRepository.getById(orderId).orElseThrow(() ->
                new IllegalArgumentException("Order with that id" + orderId +" does not exist"));
    }
}
