package com.stock.management.management.web.repositories;

import com.stock.management.management.web.entities.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine,Integer> {
}
