package com.muhammadfahd.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammadfahd.ecommerce_api.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
