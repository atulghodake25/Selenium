package KiteBase;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility
{
public static String readDatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException
{
	File myfile=new File("D:\\Excel Practice\\Test Excel.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
}

}
