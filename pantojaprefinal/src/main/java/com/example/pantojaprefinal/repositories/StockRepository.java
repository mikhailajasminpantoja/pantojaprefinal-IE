package com.example.pantojaprefinal.repositories;

import com.example.pantojaprefinal.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
