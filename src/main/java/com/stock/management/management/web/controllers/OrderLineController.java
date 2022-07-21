package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.OrderLineDTO;
import com.stock.management.management.web.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order_line")
public class OrderLineController {
    @Autowired
    OrderLineService orderLineService;

    @PostMapping("/save")
    public ResponseEntity<String> saveOrderLine(@RequestBody OrderLineDTO orderLineDTO) {

        orderLineService.save(orderLineDTO);

        return new ResponseEntity<>("Saving your OrderLine...OK!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<OrderLineDTO>> getOrderLine() {
        return new ResponseEntity<>(orderLineService.getAll(), HttpStatus.OK);

    }
}
