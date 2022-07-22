package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.CustomerDTO;
import com.stock.management.management.web.entities.Customer;
import com.stock.management.management.web.mappers.CustomerMapper;
import com.stock.management.management.web.repositories.CustomerRepository;
import com.stock.management.management.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerMapper customerMapper;


    @Override
    public void save(CustomerDTO customerDTO) {
        customerRepository.save(customerMapper.dtoToEntity(customerDTO));
    }

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> customerList = customerRepository.findAll();
        return customerList.stream().map(customer ->
                customerMapper.entityToDTO(customer)).collect(Collectors.toList());
    }

    @Override
    public Customer getById(int id) {
        return  customerRepository.getById(id).orElseThrow(() ->
                new IllegalArgumentException("Manufacturer with that name" + id +" does not exist"));
    }
}
