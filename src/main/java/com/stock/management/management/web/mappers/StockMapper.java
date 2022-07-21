package com.stock.management.management.web.mappers;

import com.stock.management.management.web.dtos.StockDTO;
import com.stock.management.management.web.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {

    @Autowired
    ProductMapper productMapper;

    public Stock dtoToEntity(StockDTO stockDTO) {
        Stock stock = new Stock();
        stock.setProduct(productMapper.dtoToEntity(stockDTO.getProduct()));
        stock.setQuantity(stockDTO.getQuantity());
        return stock;
    }

    public StockDTO entityToDTO(Stock stock){
        return new StockDTO(productMapper.entityToDTO(stock.getProduct()),stock.getQuantity());
    }
}
