package com.muhammadfahd.ecommerce_api.controller;

import com.muhammadfahd.ecommerce_api.model.TransactionItems;
import com.muhammadfahd.ecommerce_api.repository.TransactionItemsRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction-items/detail-transaction")
public class TransactionItemsController {

    @Autowired
    private TransactionItemsRepository transactionItemsRepository;

    // Endpoint: GET /api/transaction-items/{transactionId}
    @GetMapping("/{transactionId}")
    public List<TransactionItems> getItemsByTransactionId(@PathVariable Long transactionId) {
        return transactionItemsRepository.findByTransactionId(transactionId);
    }
}
