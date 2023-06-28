package com.ecommerce.billing.repository;


import com.ecommerce.billing.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Invoice save(Invoice invoice);
    Invoice findByOrderId(Long orderId);
    Invoice update(Invoice invoice);
    void deleteByOrderId(Long orderId);
    Optional<Invoice> findById(Long invoiceId);
}
