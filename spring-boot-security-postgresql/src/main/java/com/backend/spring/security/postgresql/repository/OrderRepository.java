package com.backend.spring.security.postgresql.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.spring.security.postgresql.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
