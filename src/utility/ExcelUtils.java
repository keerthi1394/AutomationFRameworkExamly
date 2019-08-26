package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	//s	private static MissingCellPolicy xRow;
	//Method to set file path and to open excel file, pass Excel Path and Sheetname as Arguments to this method
	public static void setExcelFile(String Path,String SheetName ) throws IOException
	{
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (FileNotFoundException e) {
			throw(e);
		}
	}

	//method to read test data from the excel sheet

	public static String getCellData(int RowNum, int ColNum)
	{
		try {
			Cell = 	ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData  =    Cell.getStringCellValue();
			return CellData;
		}
		catch(Exception e)
		{
			return "" ;
		}
	}
	//method to write data into excel sheet

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception
	{
		try {

			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if (Cell == null)
			{
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			}
			else
			{
				Cell.setCellValue(Result);
			}

			//constant variables Test Data path and test data file name
			FileOutputStream fileout = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileout);
			fileout.flush();
			fileout.close();
		}
		catch(Exception e)
		{
			throw(e);
		}

	}
public static int getRowContains(String sTestCaseName, int colNum)
{
	int i;
	try
	{
       int rowcount = ExcelWSheet.getLastRowNum();
       for(i =0; i<rowcount; i++)
       {
    	   if(ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName))
    	   {
    	break;
           }
       }
       return i;
}

catch(Exception e)
{
	Log.error("Class ExcelUtils | Method.getRowContains | Exception desc : " + e.getMessage());
	throw(e);
}
}
}

		
		
		
		
		
		
		
		
		
		
		
		
		

