package com.stock.management.management.web.services;


import com.stock.management.management.web.dtos.CustomerDTO;
import com.stock.management.management.web.entities.Customer;

import java.util.List;

public interface CustomerService {
    void save(CustomerDTO customerDTO);
    List<CustomerDTO> getAll();
    Customer getById(int id);

}
