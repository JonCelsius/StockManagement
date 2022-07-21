package com.stock.management.management.web.services;

import com.stock.management.management.web.dtos.ManufacturerDTO;


import java.util.List;

public interface ManufacturerService {
    void save(ManufacturerDTO manufacturerDTO);

    List<ManufacturerDTO> getAll();
}
