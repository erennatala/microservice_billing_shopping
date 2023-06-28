package com.ecommerce.billing.service;

import com.ecommerce.billing.model.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment createPayment(Payment payment);
    Payment getPaymentByOrderId(Long orderId);
    Payment updatePayment(Payment payment);
    void deletePayment(Long orderId);

    Payment getPaymentById(Long paymentId);
}
