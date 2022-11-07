package com.prm.productmanagement.prm.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {

    public Order() {
    }

    public Order(int id, String productName, Date orderDate, int quantity) {
        this.id = id;
        this.productName = productName;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String productName;

    private Date orderDate;

    private int quantity;

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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
