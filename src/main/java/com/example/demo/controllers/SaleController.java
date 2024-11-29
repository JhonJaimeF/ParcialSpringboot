package com.example.demo.controllers;

import com.example.demo.entyties.Sale;
import com.example.demo.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales") public class SaleController {
    @Autowired
    private SaleService saleService;
    @GetMapping public List<Sale> getAllSales() {
        return saleService.readSales();
    } @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return saleService.createSale(sale);
    }

}