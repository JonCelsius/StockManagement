package com.stock.management.management.web.repositories;

import com.stock.management.management.web.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
    Optional<Orders> getById(int id);
}
