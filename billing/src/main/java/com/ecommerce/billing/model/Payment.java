package com.ecommerce.billing.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "payment")

public class Payment {
    @Id
    @GeneratedValue
    private Long paymentId;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private LocalDate paymentDate;
    @ManyToOne
    @JoinColumn(name = "orderId",referencedColumnName = "id")
    private Order order;
    public Payment() {
    }
    public Payment( double amount, String status, LocalDate paymentDate) {
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

    public double getAmount() {
        return amount;
    }


}
