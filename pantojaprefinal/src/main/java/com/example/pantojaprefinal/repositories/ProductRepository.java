package com.example.pantojaprefinal.repositories;

import com.example.pantojaprefinal.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}