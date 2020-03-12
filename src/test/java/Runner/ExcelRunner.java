package Runner;

import Utils.ExcelUtils;

public class ExcelRunner {


    public static void main(String[] args) {
        ExcelUtils.openExcelFile("Employee", "Page1");


        String cellValue=ExcelUtils.getCellValue(3,4);
        System.out.println(cellValue);

        ExcelUtils.setCellValue("USA", 4,5);
        cellValue=ExcelUtils.getCellValue(4,5);
        System.out.println(cellValue);
        ExcelUtils.closeWorkBook();
        ExcelUtils.openExcelFile("Book2", "Sheet1");
        ExcelUtils.getAllExcelValue();
    }
}
