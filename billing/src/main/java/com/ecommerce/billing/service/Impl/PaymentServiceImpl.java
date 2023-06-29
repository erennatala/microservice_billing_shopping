package com.ecommerce.billing.service.Impl;

import com.ecommerce.billing.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements com.ecommerce.billing.service.PaymentService{
    private final com.ecommerce.billing.repository.PaymentRepository paymentRepository;
    @Autowired
    public PaymentServiceImpl(com.ecommerce.billing.repository.PaymentRepository paymentRepository) {
         this.paymentRepository = paymentRepository;
    }
    @Override
    public java.util.List<com.ecommerce.billing.model.Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
    @Override
    public com.ecommerce.billing.model.Payment createPayment(com.ecommerce.billing.model.Payment payment) {
        return paymentRepository.save(payment);
    }
    @Override
    public com.ecommerce.billing.model.Payment getPaymentByOrderId(Long orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
    @Override
    public com.ecommerce.billing.model.Payment updatePayment(com.ecommerce.billing.model.Payment payment) {
        return paymentRepository.save(payment);
    }
    @Override
    public void deletePayment(Long orderId) {
        paymentRepository.deleteByOrderId(orderId);
    }

    @Override
    public Payment getPaymentById(Long paymentId) {
        return null;
    }




}
