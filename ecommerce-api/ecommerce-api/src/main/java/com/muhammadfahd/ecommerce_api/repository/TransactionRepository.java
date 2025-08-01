package com.muhammadfahd.ecommerce_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammadfahd.ecommerce_api.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
}
