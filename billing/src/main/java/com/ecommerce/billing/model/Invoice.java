package com.ecommerce.billing.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue
    private Long invoiceId;
    @OneToOne
    @JoinColumn(name = "orderId",referencedColumnName = "id")
    private Order orderId;
    @Column(nullable = false)
    private Date dueDate;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private LocalDate invoiceDate;

    public Invoice() {
    }

    public Invoice(Order orderId, Date dueDate, double amount, LocalDate invoiceDate) {
        this.orderId = orderId;
        this.dueDate = dueDate;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }



    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
