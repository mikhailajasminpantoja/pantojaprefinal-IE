package com.example.pantojaprefinal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private int quantity;
    private int shopNo;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }
}