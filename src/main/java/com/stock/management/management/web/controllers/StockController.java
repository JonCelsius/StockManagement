package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.StockDTO;
import com.stock.management.management.web.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stock")
public class StockController {

    @Autowired
    StockService stockService;

    @PostMapping("/save")
    public ResponseEntity<String> saveStock(@RequestBody StockDTO stockDTO) {
        stockService.save(stockDTO);
        return new ResponseEntity<>("Your stock was saved....OK!", HttpStatus.OK);

    }

    @GetMapping("/get")
    public ResponseEntity<List<StockDTO>> getStock(){
        return new ResponseEntity<>(stockService.getAll(),HttpStatus.OK);
    }

}
