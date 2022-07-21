package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.StockDTO;

import java.util.List;

public interface StockService {
    void save(StockDTO stockDTO);
    List<StockDTO> getAll();

}
