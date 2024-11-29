package com.example.demo.repositories;

import com.example.demo.entyties.Inventary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventaryRepository extends JpaRepository<Inventary, Long> {
}
