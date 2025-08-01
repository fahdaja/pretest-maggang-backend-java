package com.muhammadfahd.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammadfahd.ecommerce_api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
