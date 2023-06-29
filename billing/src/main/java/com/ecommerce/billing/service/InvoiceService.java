package com.ecommerce.billing.service;
import com.ecommerce.billing.model.Invoice;
import org.springframework.stereotype.Service;


import java.util.List;

public interface InvoiceService {
    java.util.List<Invoice> getAllInvoices();
    Invoice createInvoice(Invoice invoice);
    Invoice getInvoiceByOrderId(Long orderId);
    Invoice updateInvoice(Invoice invoice);
    void deleteInvoice(Long orderId);
}
