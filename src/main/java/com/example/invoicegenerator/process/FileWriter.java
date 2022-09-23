package com.example.invoicegenerator.process;



import com.example.invoicegenerator.model.Invoice;
import com.example.invoicegenerator.util.UtilDataParser;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriter {

    private  String outPath = "C:\\telRan_projects\\invoicegenerator\\src\\main\\resources\\docx\\";


    public void generateNewDocxFile(final Invoice invoice) throws IOException {
        DocxReader docxReader = new DocxReader();
        var map = new UtilDataParser().getMap(invoice);

        ReplacingFactory.replacePlaceholders(new ParagraphReplacement(), docxReader, map);
        ReplacingFactory.replacePlaceholders(new TableReplacement(), docxReader, map);

        final FileOutputStream out = new FileOutputStream(outPath + invoice.getInvoiceNumber() + "docx");
        docxReader.getDocx().write(out);
        out.close();
        docxReader.getXWPFDocument().close();
    }
}
