package com.example.pantojaprefinal.repositories;

import com.example.pantojaprefinal.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}