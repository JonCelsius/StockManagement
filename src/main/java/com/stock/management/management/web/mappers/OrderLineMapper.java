package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.OrderLineDTO;

import com.stock.management.management.web.entities.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderLineMapper {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    OrdersMapper ordersMapper;

    /*public OrderLine dtoToEntity(OrderLineDTO orderLineDTO) {
        OrderLine orderLine = new OrderLine();
        orderLine.setQuantity(orderLineDTO.getQuantity());
        orderLine.setProduct(productMapper.dtoToEntity(orderLineDTO.getProduct()));
        orderLine.setOrders(ordersMapper.dtoToEntity(orderLineDTO.getOrders()));
        return orderLine;
    }*/

    public OrderLineDTO entityToDTO(OrderLine orderLine){
        return new OrderLineDTO(orderLine.getProduct().getId(),orderLine.getQuantity(),orderLine.getOrders().getId());
    }
}
