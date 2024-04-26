package com.example.pantojaprefinal.controller;

import com.example.pantojaprefinal.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.pantojaprefinal.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping("/{customerId}")
    public Customer editCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
        customer.setCustomerId(customerId);
        return customerService.saveOrUpdateCustomer(customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId) {
        customerService.deleteCustomer(customerId);
    }
}