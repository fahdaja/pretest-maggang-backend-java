package com.muhammadfahd.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammadfahd.ecommerce_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // This interface will automatically provide CRUD operations for User entities
    // Additional custom query methods can be defined here if needed
    
}
