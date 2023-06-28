package com.ecommerce.billing.repository;

import com.ecommerce.billing.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment save(Payment payment);
    Payment findByOrderId(Long orderId);
    Payment update(Payment payment);
    void deleteByOrderId(Long orderId);
    Optional<Payment> findById(Long paymentId);




}
