package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelUtils {
    private static Workbook excelBook;
    private static Sheet excelSheet;
    private static Row row;
    private static Cell cell;
    private static String filePath;

    public static void openExcelFile(String FileName, String SheetName){
        filePath="src/test/resources/com.cucumber.feature.ExcelData/"+FileName+".xlsx";
        try{
            File file=new File(filePath);
            FileInputStream fileInputStream=new FileInputStream(file);
            excelBook= new XSSFWorkbook(fileInputStream);
            excelSheet=excelBook.getSheet(SheetName);

        }catch (Exception e){
            System.out.println("The file doesn't exist!");

        }

    }
        public static String getCellValue(int rowNum, int cellNum){

        row=excelSheet.getRow(rowNum);
        cell=row.getCell(cellNum);
        return cell.toString();

    }
    public static  void setCellValue(String value, int rowNum, int cellNum){
        row=excelSheet.getRow(rowNum);
        cell=row.getCell(cellNum);
        if(cell==null){
            row=excelSheet.createRow(rowNum);
            cell=row.createCell(cellNum);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(value);

        }else {
            cell.setCellValue(value);
        }

    }


    public static  void getAllExcelValue(){

        for(int i=excelSheet.getFirstRowNum(); i<excelSheet.getLastRowNum();i++){
            row=excelSheet.getRow(i);
            for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++){
                cell =row.getCell(j);
                System.out.print(cell+" |");
            }
            System.out.println();
        }

    }
    public static void closeWorkBook(){
        try{
        excelBook.close();
    }catch (Exception e){
            e.printStackTrace();
        }
}
}
