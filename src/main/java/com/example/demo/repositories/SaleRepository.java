package com.example.demo.repositories;

import com.example.demo.entyties.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}