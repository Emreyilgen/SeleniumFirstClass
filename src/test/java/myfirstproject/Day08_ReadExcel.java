package myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day08_ReadExcel {

    @Test
    public void readExcel() {

//        Store the path of the file in a string Open the file
        String path = "resources/Capitals.xlsx";
//        Open the workbook using fileinputstream
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            // first we need to open workbook
            Workbook workbook = WorkbookFactory.create(fileInputStream);  // to open the exce; sheet

//        Open the first worksheet
            Sheet sheet1 = workbook.getSheetAt(0);   // this one get first sheet
           //Sheet sheet1= workbook.getSheet("Sheet1");    // gets first sheet using name
//        Go to first row
           Row row1 = sheet1.getRow(0); // index starts at 0
//        Go to first cell on that first row and print
            Cell r1c1 = row1.getCell(0);
            System.out.println("first row first cell  = " + r1c1);
//        Go to second cell on that first row and print
            Cell r1c2 = row1.getCell(1);
            System.out.println("first row second cell = " + r1c2);
//        Go to 2nd row first cell and assert if the data equal to USA
            Row row2 = sheet1.getRow(1);
            String r2c1 = row2.getCell(0).toString();
            Assertions.assertTrue(r2c1.equals("USA"));
            System.out.println("second row first cell = " + r2c1);
//        Go to 3rd row 2nd cell-chain the row and cell
            String r3c2 = sheet1.getRow(2).getCell(1).toString();
            System.out.println("third row second cell = " + r3c2);

//        Find the number of row
            int numOfRows = sheet1.getLastRowNum()+1;
            System.out.println("numOfRows = " + numOfRows); //// returns all used rows without header


//        Find the number of used row
            int totalRows = sheet1.getPhysicalNumberOfRows();   // returns all used rows including header
            System.out.println("totalRows = " + totalRows);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        HOMEWORK : Print country, capital key value pairs as map object()
//        create a map
//        then use a loop to add key-value pairs in the map
//        use the pattern of indexes
//        String countries = sheet1.getRow(row number).getCell(0).toString
//        String capitals = sheet1.getRow(row number).getCell(1).toString
//        add this to the map
//        then print
//        {greece = athens, Canada= Ottowa,...}
    }
}
