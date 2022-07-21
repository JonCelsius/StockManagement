package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.OrderLineDTO;
import com.stock.management.management.web.entities.OrderLine;
import com.stock.management.management.web.mappers.OrderLineMapper;
import com.stock.management.management.web.repositories.OrderLineRepository;
import com.stock.management.management.web.services.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderLineServiceImpl implements OrderLineService {

    @Autowired
    OrderLineMapper orderLineMapper;

    @Autowired
    OrderLineRepository orderLineRepository;

    @Override
    public void save(OrderLineDTO orderLineDTO) {
        orderLineRepository.save(orderLineMapper.dtoToEntity(orderLineDTO));
    }

    @Override
    public List<OrderLineDTO> getAll() {
        List<OrderLine> orderLineList = orderLineRepository.findAll();
        return orderLineList.stream().map(orderLine ->
                orderLineMapper.entityToDTO(orderLine)).collect(Collectors.toList());
    }
}
