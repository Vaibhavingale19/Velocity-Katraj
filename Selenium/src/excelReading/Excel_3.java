package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File MyFile = new File("D:\\Velocity\\Test Case Apache.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Student");
		
		//I read one column using static coding
//		for(int i=0; i<=5; i++)
//		{
//			String value = mysheet.getRow(i).getCell(2).getStringCellValue();
//			System.out.println(value+" ");
//		}
		
		//By using dynamic coding
		int lastRowNo = mysheet.getLastRowNum();
		int totalrowCount = lastRowNo;
		
		for(int i=0; i<=totalrowCount; i++)
		{
			String value1 = mysheet.getRow(i).getCell(2).getStringCellValue();
			System.out.print(value1+" ");
		}
	}

}
