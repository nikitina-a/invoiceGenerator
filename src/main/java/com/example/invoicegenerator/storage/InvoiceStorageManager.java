package com.example.invoicegenerator.storage;

import com.example.invoicegenerator.model.Invoice;
import org.springframework.stereotype.Component;

/**
 *  Class contains methods witch stores and removes documents on cloud.
 *  TODO Actual implementation
 */
@Component
public class InvoiceStorageManager {

    public String store(Invoice invoice) {
        return "some_url";
    }

    public void delete(Invoice invoice) {

    }

}
