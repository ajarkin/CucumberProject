package StepDefinitions.ExcelPractice;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelTest {
    public static void main(String[] args) throws Exception {
        String filepath="src/test/resources/com.cucmber.feature.ExcelData/Book2.xlsx";
        File file =new File(filepath);
        FileInputStream inputStream=new FileInputStream(file);

        Workbook excelWorkbook=new XSSFWorkbook(inputStream);
        Sheet excelSheet=excelWorkbook.getSheet("Sheet1");
        Row row=excelSheet.getRow(3);
        Cell cell=row.getCell(1);
        System.out.println(cell);
        row=excelSheet.createRow(5);
        cell=row.createCell(0);
        cell.setCellType(CellType.STRING);
        cell.setCellValue("Test16");

        FileOutputStream outputStream=new FileOutputStream(filepath);
        excelWorkbook.write(outputStream);

        String expected ="Test16";
        row=excelSheet.getRow(5);
        cell=row.getCell(0);
        String actual=cell.toString();
        Assert.assertEquals(expected,actual);


        row=excelSheet.getRow(2);
        cell=row.getCell(1);
        cell.setCellValue("Techtorial");

        FileOutputStream outputStream1=new FileOutputStream(filepath);
        excelWorkbook.write(outputStream1);
        System.out.println(cell);


    }
}
