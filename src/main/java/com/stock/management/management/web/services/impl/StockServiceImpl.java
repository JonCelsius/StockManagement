package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.StockDTO;
import com.stock.management.management.web.entities.Stock;
import com.stock.management.management.web.mappers.StockMapper;
import com.stock.management.management.web.repositories.StockRepository;
import com.stock.management.management.web.services.ProductService;
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

    @Autowired
    ProductService productService;

    @Override
    public void save(StockDTO stockDTO) {
        Stock stock=new Stock();
        stock.setProduct(productService.getById(stockDTO.getProductId()));
        stock.setQuantity(stockDTO.getQuantity());

        stockRepository.save(stock);
    }

    @Override
    public List<StockDTO> getAll() {
        List<Stock> stockList = stockRepository.findAll();
        return stockList.stream().map(stock -> stockMapper.entityToDTO(stock)).collect(Collectors.toList());
    }
}
