package com.example.invoicegenerator.util;

import com.example.invoicegenerator.model.Invoice;

import java.time.Instant;

public class InvoiceNumberGenerator {


    public static String generate(Invoice invoice) {

        return String.valueOf(Instant.now().getEpochSecond() + invoice.hashCode());
    }
}
