package com.onlinemarket.service;

import com.onlinemarket.dto.invoiceDocument.CreateInvoiceDocumentDTO;
import com.onlinemarket.dto.invoiceDocument.InvoiceDocumentDTO;
import com.onlinemarket.dto.invoiceDocument.UpdateInvoiceDocumentDTO;

import java.util.List;

public interface InvoiceDocumentService {
    InvoiceDocumentDTO createInvoiceDocument(CreateInvoiceDocumentDTO createInvoiceDocumentDTO);
    InvoiceDocumentDTO updateInvoiceDocumentById(Long id, UpdateInvoiceDocumentDTO updateInvoiceDocumentDTO);
    InvoiceDocumentDTO getInvoiceDocumentById(Long id);
    List<InvoiceDocumentDTO> getInvoiceDocumentList();
    void deleteInvoiceDocumentById(Long id);
}
