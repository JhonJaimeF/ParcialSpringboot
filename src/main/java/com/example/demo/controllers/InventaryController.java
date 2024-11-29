package com.example.demo.controllers;

import com.example.demo.entyties.Inventary;
import com.example.demo.repositories.InventaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventary")
public class InventaryController {
    @Autowired
    private InventaryRepository inventoryRepository;
    @GetMapping
    public List<Inventary> getAllInventory() {
        return inventoryRepository.findAll();
    }
    @GetMapping("/{productId}")
    public Inventary getInventoryByProductId(@PathVariable Long productId) {
        return inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
