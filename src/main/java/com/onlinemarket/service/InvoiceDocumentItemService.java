package com.onlinemarket.service;

import com.onlinemarket.dto.invoiceDocumentItem.CreateInvoiceDocumentItemDTO;
import com.onlinemarket.dto.invoiceDocumentItem.InvoiceDocumentItemDTO;
import com.onlinemarket.dto.invoiceDocumentItem.UpdateInvoiceDocumentItemDTO;

import java.util.List;

public interface InvoiceDocumentItemService {
    InvoiceDocumentItemDTO createInvoiceDocumentItem(CreateInvoiceDocumentItemDTO createInvoiceDocumentItemDTO);
    InvoiceDocumentItemDTO updateInvoiceDocumentItem(Long id, UpdateInvoiceDocumentItemDTO updateInvoiceDocumentItemDTO);
    InvoiceDocumentItemDTO getInvoiceDocumentItemById(Long id);
    List<InvoiceDocumentItemDTO> getInvoiceDocumentItemList();
    void deleteInvoiceDocumentItemById(Long id);
}
