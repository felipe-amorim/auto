package com.autoavaliar.support.tbi;

import com.autoavaliar.intern.Instances;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {


    public static List<List<String>> lerPlanilhaXlsx(String path, String sheetName) {
        List<List<String>> linhas = new ArrayList<>();

        int linhaCount = 0;
        try {
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            for (Row cells : sheet) {
                List<String> celulas = new ArrayList<>();
                linhaCount++;
                Iterator<Cell> cellIterator = cells.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            if (String.valueOf(cell.getNumericCellValue()).length() > 0) {
                                //if (linhaCount >= linhaI && linhaCount <= linhaF) {
                                celulas.add(String.valueOf(cell.getNumericCellValue()));
                                //}
                            }
                            break;
                        case Cell.CELL_TYPE_STRING:
                            if (cell.getStringCellValue().length() > 0) {
                                //if (linhaCount >= linhaI && linhaCount <= linhaF) {
                                celulas.add(cell.getStringCellValue());
                                //}
                            }
                            break;
                    }
                }
                linhas.add(celulas);
            }
            file.close();
        } catch (Exception e) {
            Instances.getReportClassInstance().stepFail(e);
            e.printStackTrace();
        }
        return linhas;
    }

    public static List<List<String>> lerPlanilhaXlsxIndex(String path, int sheetIndex) {
        List<List<String>> linhas = new ArrayList<>();

        int linhaCount = 0;
        try {
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
            for (Row cells : sheet) {
                List<String> celulas = new ArrayList<>();
                linhaCount++;
                Iterator<Cell> cellIterator = cells.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            if (String.valueOf(cell.getNumericCellValue()).length() > 0) {
                                //if (linhaCount >= linhaI && linhaCount <= linhaF) {
                                celulas.add(String.valueOf(cell.getNumericCellValue()));
                                //}
                            }
                            break;
                        case Cell.CELL_TYPE_STRING:
                            if (cell.getStringCellValue().length() > 0) {
                                //if (linhaCount >= linhaI && linhaCount <= linhaF) {
                                celulas.add(cell.getStringCellValue());
                                //}
                            }
                            break;
                    }
                }
                linhas.add(celulas);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("error excel - "+e.getMessage());
        }
        return linhas;
    }


    public static List<List<String>> lerPlanilhaXls(String path, String sheetName) {
        List<List<String>> retorno = new ArrayList<>();
        try {
            Workbook workbook = Workbook.getWorkbook(new File(path));
            Sheet sheet = workbook.getSheet(sheetName);
            int contadorDeLinhas = sheet.getRows();
            for(int i = 0; i < contadorDeLinhas; i++) {
                jxl.Cell[] linhas = sheet.getRow(i);
                List<String> dados = new ArrayList<>();
                for (jxl.Cell celula: linhas) {
                    dados.add(celula.getContents());
                }
                retorno.add(dados);
            }
            workbook.close();
            } catch (IOException | BiffException e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
