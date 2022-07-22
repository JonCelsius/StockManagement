package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.OrdersDTO;
import com.stock.management.management.web.entities.Orders;
import org.springframework.stereotype.Component;

@Component
public class OrdersMapper {


  /*  public Orders dtoToEntity(OrdersDTO ordersDTO){
        Orders orders=new Orders();
        orders.setCustomer(customerMapper.dtoToEntity(ordersDTO.getCustomer()));
        orders.setOrderDate(ordersDTO.getOrder_date());
        return orders;
    }*/

    public OrdersDTO entityToDTO(Orders orders){

        return new OrdersDTO(orders.getCustomer().getId(),orders.getOrderDate());
    }


}
