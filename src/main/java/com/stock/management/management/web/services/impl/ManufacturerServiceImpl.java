package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.ManufacturerDTO;
import com.stock.management.management.web.entities.Manufacturer;
import com.stock.management.management.web.mappers.ManufacturerMapper;
import com.stock.management.management.web.repositories.ManufacturerRepository;
import com.stock.management.management.web.services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    ManufacturerMapper manufacturerMapper;

    @Autowired
    ManufacturerRepository manufacturerRepository;


    @Override
    public void save(ManufacturerDTO manufacturerDTO) {
        manufacturerRepository.save(manufacturerMapper.dtoToEntity(manufacturerDTO));
    }

    @Override
    public List<ManufacturerDTO> getAll() {
        List<Manufacturer> manufacturerList=manufacturerRepository.findAll();
        return manufacturerList.stream().map(manufacturer ->
                manufacturerMapper.entityToDTO(manufacturer)).collect(Collectors.toList());
    }
}
