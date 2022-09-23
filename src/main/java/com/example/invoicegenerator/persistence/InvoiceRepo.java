package com.example.invoicegenerator.persistence;

import com.example.invoicegenerator.model.Invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice,Long> {


}
