package com.example.invoicegenerator.util;


import com.example.invoicegenerator.model.Invoice;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.HashMap;
import java.util.Map;


public class UtilDataParser {

    private Map<String,String> map = new HashMap<>();

    public Map<String, String> getMap(Invoice invoice) {
        ObjectMapper oMapper = new ObjectMapper();
        return oMapper.convertValue(invoice, Map.class);
    }

    public Map<String, String> getMap() {
        return map;
    }
}
