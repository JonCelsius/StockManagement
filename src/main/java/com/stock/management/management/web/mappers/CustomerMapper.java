package com.stock.management.management.web.mappers;


import com.stock.management.management.web.dtos.CustomerDTO;
import com.stock.management.management.web.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer dtoToEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setAddress(customerDTO.getAddress());
        customer.setPhoneNumber(customerDTO.getPhoneNumber());
        return customer;
    }

    public CustomerDTO entityToDTO(Customer customer) {
        return new CustomerDTO(customer.getName(), customer.getAddress(), customer.getPhoneNumber());
    }

}
