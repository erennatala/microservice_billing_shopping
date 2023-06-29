package com.ecommerce.billing.service.Impl;
import com.ecommerce.billing.model.Invoice;
import com.ecommerce.billing.repository.InvoiceRepository;
import com.ecommerce.billing.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;
    @Autowired
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    @Override
    public Invoice getInvoiceByOrderId(Long orderId) {
        return invoiceRepository.findById(orderId).orElse(null);
    }
    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    @Override
    public void deleteInvoice(Long orderId) {
        invoiceRepository.deleteById(orderId);
    }



}
