package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.ManufacturerDTO;
import com.stock.management.management.web.entities.Manufacturer;


import java.util.List;
import java.util.Optional;

public interface ManufacturerService {
    void save(ManufacturerDTO manufacturerDTO);

    List<ManufacturerDTO> getAll();

    Manufacturer getByName(String name);
}
