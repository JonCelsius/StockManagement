package com.stock.management.management.web.services;


import com.stock.management.management.web.dtos.BrandDTO;
import com.stock.management.management.web.entities.Brand;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface BrandService {
    void save(BrandDTO brandDTO);

    List<BrandDTO> getAll();
}
