package com.muhammadfahd.ecommerce_api.controller;


import com.muhammadfahd.ecommerce_api.model.Transaction;
import com.muhammadfahd.ecommerce_api.model.TransactionItems;
import com.muhammadfahd.ecommerce_api.repository.TransactionRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// /api/transactions/checkout/{userId}
@RestController
@RequestMapping("/api/transactions/checkout")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    // Endpoint: GET /api/transactions/user/{userId}
    @GetMapping("/{userId}")
    public List<Transaction> getTransactionsByUserId(@PathVariable Long userId) {
        return transactionRepository.findByUserId(userId);
    }
    
}
