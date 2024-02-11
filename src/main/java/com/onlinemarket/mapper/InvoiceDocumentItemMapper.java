package com.onlinemarket.mapper;

import com.onlinemarket.dto.invoiceDocumentItem.InvoiceDocumentItemDTO;
import com.onlinemarket.entity.InvoiceDocumentItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceDocumentItemMapper extends EntityMapper<InvoiceDocumentItemDTO, InvoiceDocumentItem>{
}
