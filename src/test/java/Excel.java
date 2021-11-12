import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;

public class Excel {

    public static void main(String[] args) throws IOException {

        Excel excel = new Excel();

        //excel.WriteExel();

        excel.ReadExcel();
    }

    @Test
    public void WriteExel() throws IOException {

        File file = new File("C:\\abcd.xlsx");

        FileOutputStream fis = new FileOutputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Sheet 1 ");

        Row row = sheet.createRow(0);

        Cell cell = row.createCell(0);

        Cell cell1 = row.createCell(1);

        cell.setCellValue("Name");

        cell1.setCellValue("Siddhesh");

        workbook.write(fis);

        fis.close();


    }
    @Test
    public void ReadExcel() throws IOException {

        File file = new File("C:\\abcd.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fileInputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(1);

        //System.out.println(cell);

       String value = cell.getStringCellValue();

        System.out.println(value);

        fileInputStream.close();


    }


}
