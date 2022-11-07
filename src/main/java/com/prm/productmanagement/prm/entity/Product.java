package com.prm.productmanagement.prm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private String productName;

    private int price;

    public Product() {
    }

    public Product(int id, String productName, int price, int unitInStock) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.unitInStock = unitInStock;
    }

    private int unitInStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

}
