package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File MyFile = new File("D:\\Velocity\\Test Case Apache.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Student");
		
      	int totalRowCount = mysheet.getLastRowNum();
      	int totalCellCount = mysheet.getRow(totalRowCount).getLastCellNum()-1;
      	
      	for(int i=0; i<=totalRowCount; i++)
      	{
      		for(int j=0; j<=totalCellCount; j++)
      		{
      			Cell cell = mysheet.getRow(i).getCell(j);
      			CellType type = cell.getCellType();
      			
      			if(type==CellType.STRING)
      			{
      				System.out.print(cell.getStringCellValue()+" ||");
      			}
      			else if(type==CellType.BOOLEAN)
      			{
      				System.out.print(cell.getBooleanCellValue()+" ||");
      			}
      			else if (type==CellType.NUMERIC)
      			{
      				System.out.print(cell.getNumericCellValue()+" ||");
      			}
      		}
      		System.out.println();
	}
      
	}
	
}
