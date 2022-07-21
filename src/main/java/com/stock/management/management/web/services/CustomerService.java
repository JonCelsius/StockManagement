package com.stock.management.management.web.services;


import com.stock.management.management.web.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void save(CustomerDTO customerDTO);
    List<CustomerDTO> getAll();

}
