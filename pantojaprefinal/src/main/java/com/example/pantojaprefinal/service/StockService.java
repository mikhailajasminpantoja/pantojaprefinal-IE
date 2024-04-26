package com.example.pantojaprefinal.service;

import com.example.pantojaprefinal.models.Stock;
import com.example.pantojaprefinal.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }
}