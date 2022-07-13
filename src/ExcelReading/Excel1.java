package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Excel Practice\\Result group A-1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int row = mysheet.getLastRowNum();
		int countrow = row;
		System.out.println(countrow);
		short totalcolumn = mysheet.getRow(countrow).getLastCellNum();
		int countcell = totalcolumn-1;
		System.out.println(countcell);
		
		for(int i=0;i<=countrow;i++)
		{
			for(int j=0;j<=countcell;j++)
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType datatype = cellvalue.getCellType();	
				if(datatype==CellType.STRING)
				{
					String value = cellvalue.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value = cellvalue.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print(" ");
				}
			
}
			System.out.println();
		}


	}

}
