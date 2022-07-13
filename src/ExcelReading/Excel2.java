package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Excel Practice\\Test Excel.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet sheet = book.getSheet("Sheet1");
		
		

		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
