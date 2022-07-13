package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Excel Practice\\Test Excel.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row myRow = mysheet.getRow(2);
		Cell mycell = myRow.getCell(2);
		System.out.println(mycell.getCellType());
		
	
	}

}
