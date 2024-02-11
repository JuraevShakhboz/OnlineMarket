package com.onlinemarket.dto.invoiceDocumentItem;

import com.onlinemarket.entity.InvoiceDocument;
import com.onlinemarket.entity.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InvoiceDocumentItemDTO {
    Long id;
    InvoiceDocument invoiceDocument;
    Product product;
    Float amount;
    Float purchasePrice;
}
