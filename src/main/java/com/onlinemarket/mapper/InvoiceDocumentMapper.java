package com.onlinemarket.mapper;

import com.onlinemarket.dto.invoiceDocument.InvoiceDocumentDTO;
import com.onlinemarket.entity.InvoiceDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceDocumentMapper extends EntityMapper<InvoiceDocumentDTO, InvoiceDocument>{
}
