package com.onlinemarket.repository;

import com.onlinemarket.entity.InvoiceDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDocumentRepository extends JpaRepository<InvoiceDocument,Long> {
}
