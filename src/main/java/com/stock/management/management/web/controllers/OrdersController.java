package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.OrdersDTO;
import com.stock.management.management.web.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @PostMapping("/save")
    public ResponseEntity<String> saveOrder(@RequestBody OrdersDTO ordersDTO) {
        ordersService.save(ordersDTO);
        return new ResponseEntity<>("Your Order was saved.....OK!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<OrdersDTO>> getOrders() {
        return new ResponseEntity<>(ordersService.getAll(), HttpStatus.OK);
    }
}
