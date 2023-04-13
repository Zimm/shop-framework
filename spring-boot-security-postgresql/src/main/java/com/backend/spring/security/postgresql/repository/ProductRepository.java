package com.backend.spring.security.postgresql.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.spring.security.postgresql.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
