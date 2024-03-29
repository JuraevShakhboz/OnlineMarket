package com.onlinemarket.dto.organization;

import com.onlinemarket.entity.InvoiceDocument;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationDTO {
    Long id;
    String name;
    String address;
    String phoneNumber;
    Float clientDebt;
    Float payment;
    List<InvoiceDocument> invoiceDocumentList;
}
