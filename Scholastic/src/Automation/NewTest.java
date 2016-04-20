package Automation;

import java.io.File;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Label;
import jxl.write.WriteException;


public class NewTest {

    static Workbook wbook;
    static WritableWorkbook wwbCopy;
    static String ExecutedTestCasesSheet;
    static WritableSheet shSheet;
    
    public void readExcel()
    {
    try{
    wbook = Workbook.getWorkbook(new File("D:\\scholastic\\testdata.xls"));
    wwbCopy = Workbook.createWorkbook(new File("D:\\scholastic\\testdata.xls"), wbook);
    shSheet = wwbCopy.getSheet(0);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void setValueIntoCell(String strSheetName,int iColumnNumber, int iRowNumber,String strData) throws WriteException
    {
        WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
        Label labTemp = new Label(iColumnNumber, iRowNumber, strData);
                
        try {
            wshTemp.addCell(labTemp);
             } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
    
    public void closeFile()
    {
        try {
            // Closing the writable work book
            wwbCopy.write();
            wwbCopy.close();

            // Closing the original work book
            wbook.close();
        } catch (Exception e)

        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws WriteException
    {
        NewTest ds = new NewTest();
        ds.readExcel();
        ds.setValueIntoCell("sheet1", 2, 1, "PASS");
        ds.setValueIntoCell("sheet1", 2, 2, "FAIL");
        ds.setValueIntoCell("sheet1", 2, 3, "PASS");
        ds.closeFile();
    }
}