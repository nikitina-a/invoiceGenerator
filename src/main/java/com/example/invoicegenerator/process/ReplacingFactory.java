package com.example.invoicegenerator.process;

import java.io.FileNotFoundException;
import java.util.Map;

public class ReplacingFactory {

    public static void replacePlaceholders(PlaceHolderReplacer placeHolderReplacer,
                                           DocxReader docxReader,
                                           Map<String, String> map) throws FileNotFoundException {
        placeHolderReplacer.replacePlaceholders(map,docxReader);

    }
}
