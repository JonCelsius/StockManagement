package com.stock.management.management.web.services.impl;

import com.stock.management.management.web.dtos.BrandDTO;
import com.stock.management.management.web.entities.Brand;
import com.stock.management.management.web.mappers.BrandMapper;
import com.stock.management.management.web.repositories.BrandRepository;
import com.stock.management.management.web.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Autowired
    BrandMapper brandMapper;

    @Override
    public void save(BrandDTO brandDTO) {
        brandRepository.save(brandMapper.dtoToEntity(brandDTO));
    }

    @Override
    public List<BrandDTO> getAll() {
//        List<BrandDTO> brandDTOList = new ArrayList<>();
        List<Brand> brandList = brandRepository.findAll();
//        for (Brand element : brandList) {
//            brandDTOList.add(brandMapper.entityToDTO(element));
//        }
//        return brandDTOList;

        return brandList.stream().map(brand -> brandMapper.entityToDTO(brand)).collect(Collectors.toList());
    }

    @Override
    public Brand getByName(String name) {
        return brandRepository.getByName(name).orElseThrow(() ->
                new IllegalArgumentException("Brand with that name" + name +" does not exist"));
    }

}
