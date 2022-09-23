package com.example.invoicegenerator.controller;

import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.service.InvoiceService;

import com.example.invoicegenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/invoice")
public class InvoiceController {

    private final InvoiceService service;
    private final UserService userService;

    @Autowired
    public InvoiceController(InvoiceService service, UserService userService) {

        this.service = service;
        this.userService = userService;
    }



    @PostMapping(path = "/new/{id}")
    public ResponseEntity<String> createInvoice(@PathVariable Long id, @RequestBody Invoice invoice) {
        Invoice invoiceNew = service.createInvoice(id,invoice);
        return new ResponseEntity<String>("Invoice with number:" + invoiceNew.getInvoiceNumber() + "has been created.", HttpStatus.CREATED);
    }

    @GetMapping(path = "/invoice/{id}")
    public Invoice getInvoice(@PathVariable Long id) {

        return service.getInvoice(id);
    }
    @PutMapping(path = "/invoice/edit")
    public String editInvoice(@RequestBody Invoice invoice) {
        return service.editInvoice(invoice);
    }
}
