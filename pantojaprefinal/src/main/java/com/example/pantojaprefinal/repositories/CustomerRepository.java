package com.example.pantojaprefinal.repositories;
import com.example.pantojaprefinal.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
