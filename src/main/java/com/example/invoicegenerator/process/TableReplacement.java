package com.example.invoicegenerator.process;


import org.apache.poi.xwpf.usermodel.*;

import java.util.Map;

public class TableReplacement implements PlaceHolderReplacer {


    @Override
    public void replacePlaceholders(Map<String, String> map, DocxReader docxReader) {
        outerForLoop:
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            for (XWPFTable xwpfTable : docxReader.getDocx().getTables())
            {
                for (XWPFTableRow xwpfTableRow : xwpfTable.getRows())
                {
                    for (XWPFTableCell xwpfTableCell : xwpfTableRow.getTableCells())
                    {
                        for (XWPFParagraph xwpfParagraph : xwpfTableCell.getParagraphs())
                        {
                            for (XWPFRun xwpfRun : xwpfParagraph.getRuns())
                            {
                                String text = xwpfRun.text();
                                if (
                                        text != null
                                                && text.contains(entry.getKey())
                                                && entry.getValue() != null
                                                && !entry.getValue().isEmpty()
                                )
                                {
                                    text = text.replace(entry.getKey(), entry.getValue());
                                    xwpfRun.setText(text, 0);
                                    continue outerForLoop;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

