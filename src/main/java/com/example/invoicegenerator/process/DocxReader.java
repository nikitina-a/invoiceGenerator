package com.example.invoicegenerator.process;


import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class DocxReader {
    private final String filePath = "C:\\telRan_projects\\invoicegenerator\\src\\main\\resources\\docx\\invoice_telran.docx";
    private XWPFDocument docx;

    public DocxReader() {

        docx = getXWPFDocument();
    }

    public XWPFDocument getDocx() {
        return docx;
    }

    public XWPFDocument getXWPFDocument() {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            docx = new XWPFDocument(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return docx;
    }
}
