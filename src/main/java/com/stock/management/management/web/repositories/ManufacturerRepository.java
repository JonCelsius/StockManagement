package com.stock.management.management.web.repositories;

import com.stock.management.management.web.entities.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

    Optional<Manufacturer> getByName(String name);

}
