package com.muhammadfahd.ecommerce_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhammadfahd.ecommerce_api.model.Cart;
import com.muhammadfahd.ecommerce_api.repository.CartRepository;

@RestController
@RequestMapping("/api/cart")
public class CartController {
        @Autowired
        private CartRepository cartRepository;

        @GetMapping 
        public List<Cart> getAllCarts() {
            return cartRepository.findAll();    
        }   
        @PostMapping
        public Cart createCart(@RequestBody Cart cart) {
            return cartRepository.save(cart);
        }   
        
}
