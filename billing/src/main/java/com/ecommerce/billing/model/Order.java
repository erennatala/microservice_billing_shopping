package com.ecommerce.billing.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long customerId;
    @Column(nullable = false)
    private double totalAmount;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private Date orderDate;

    // Constructors, getters, and setters
    public Order() {
    }
    public Order(Long customerID, double totalAmount, String status, Date orderDate) {
        this.customerId = customerID;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
    }
    @ElementCollection
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "item")
    private List<String> orderItems;

    public List<String> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
    }
    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long orderID) {
        this.id = orderID;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerID) {
        this.customerId = customerID;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }





}
