package com.stock.management.management.web.controllers;


import com.stock.management.management.web.dtos.CustomerDTO;
import com.stock.management.management.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return new ResponseEntity<>("DONE!!!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<CustomerDTO>> getCustomer() {
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);

    }
}
