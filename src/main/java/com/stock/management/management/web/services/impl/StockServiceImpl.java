package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.StockDTO;
import com.stock.management.management.web.entities.Stock;
import com.stock.management.management.web.mappers.StockMapper;
import com.stock.management.management.web.repositories.StockRepository;
import com.stock.management.management.web.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockRepository stockRepository;

    @Autowired
    StockMapper stockMapper;


    @Override
    public void save(StockDTO stockDTO) {
        stockRepository.save(stockMapper.dtoToEntity(stockDTO));
    }

    @Override
    public List<StockDTO> getAll() {
        List<Stock> stockList = stockRepository.findAll();
        return stockList.stream().map(stock -> stockMapper.entityToDTO(stock)).collect(Collectors.toList());
    }
}
