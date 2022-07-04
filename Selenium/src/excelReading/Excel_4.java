package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Total sheet read
		File MyFile = new File("D:\\Velocity\\Test Case Apache.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Student");

		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				double value1 = mysheet.getRow(i).getCell(j).getNumericCellValue();
				boolean value2 = mysheet.getRow(i).getCell(j).getBooleanCellValue();
				System.out.print(value+" ");
				System.out.print(value1+" ");
				System.out.print(value2+" ");
			}
			System.out.println();
		}
	}
         

}
