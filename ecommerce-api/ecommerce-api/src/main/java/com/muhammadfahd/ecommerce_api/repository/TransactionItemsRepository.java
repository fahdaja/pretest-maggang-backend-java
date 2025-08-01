package com.muhammadfahd.ecommerce_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammadfahd.ecommerce_api.model.TransactionItems;

public interface TransactionItemsRepository extends JpaRepository<TransactionItems, Long> {
    List<TransactionItems> findByTransactionId(Long transactionId);
}
