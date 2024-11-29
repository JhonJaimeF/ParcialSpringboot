package com.example.demo.services;

import com.example.demo.entyties.Inventary;
import com.example.demo.entyties.Sale;
import com.example.demo.repositories.InventaryRepository;
import com.example.demo.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private InventaryRepository inventoryRepository;
    public Sale createSale(Sale sale) {
        // Validar inventario
        Inventary inventory = inventoryRepository.findById(sale.getProductId()).orElseThrow();

        if (inventory.getQuantity() < sale.getQuantity()) {
            throw new RuntimeException("Insufficient inventory");
        } // Actualizar inventario
         inventory.setQuantity(inventory.getQuantity() - sale.getQuantity());

        inventoryRepository.save(inventory);
        return saleRepository.save(sale);
    }

    public List<Sale> readSales() {
        return saleRepository.findAll();
    }
}
