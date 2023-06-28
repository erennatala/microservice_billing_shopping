package com.ecommerce.billing.controller;

import com.ecommerce.billing.model.Payment;
import com.ecommerce.billing.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{paymentId}")
    public Payment getPaymentById(Long paymentId) {
        return paymentService.getPaymentById(paymentId);
    }

    @PostMapping
    public Payment createPayment(Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PutMapping("/{paymentId}")
    public Payment updatePayment(Payment payment) {
        return paymentService.updatePayment(payment);
    }
}
