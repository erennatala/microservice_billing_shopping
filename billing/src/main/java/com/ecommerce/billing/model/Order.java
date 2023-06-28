package com.ecommerce.billing.model;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
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
    // Getters and setters
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderID) {
        this.orderId = orderID;
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
