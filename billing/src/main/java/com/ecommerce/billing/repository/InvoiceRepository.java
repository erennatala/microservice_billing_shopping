package com.ecommerce.billing.repository;


import com.ecommerce.billing.model.Invoice;
import com.ecommerce.billing.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    Invoice findByOrderId(Order order);
    void deleteByOrderId(Order order);
    Optional<Invoice> findById(Long invoiceId);
}
