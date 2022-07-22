package com.stock.management.management.web.repositories;

import com.stock.management.management.web.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

    Optional<Brand> getByName(String name);

}
