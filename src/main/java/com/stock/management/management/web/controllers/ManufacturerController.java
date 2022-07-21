package com.stock.management.management.web.controllers;

import com.stock.management.management.web.dtos.ManufacturerDTO;
import com.stock.management.management.web.services.ManufacturerService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("manufacturer")
public class ManufacturerController {

    @Autowired
    ManufacturerService manufacturerService;

    @PostMapping("/save")
    public ResponseEntity<String> saveManufacturer(@RequestBody ManufacturerDTO manufacturerDTO) {
        manufacturerService.save(manufacturerDTO);
        return new ResponseEntity<>("DONE!!!!", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<ManufacturerDTO>> getManufacturer() {
        return new ResponseEntity<>(manufacturerService.getAll(), HttpStatus.OK);
    }
}
