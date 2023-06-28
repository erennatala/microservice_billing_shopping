package com.ecommerce.billing.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Long paymentId;
    @Column(nullable = false)
    private Long orderId;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private LocalDate paymentDate;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    public Payment() {
    }
    public Payment(Long orderId, double amount, String status, LocalDate paymentDate) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
        this.paymentDate = paymentDate;
    }
    public Long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(Long paymentID) {
        this.paymentId = paymentID;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderID) {
        this.orderId = orderID;
    }
    public double getAmount() {
        return amount;
    }


}
