package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File MyFile = new File("D:\\Velocity\\Test Case Apache.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("Student");
		
		

//				for(int i=1; i<=5; i++)//Static coding
//		{
//			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.print(value+" ");
//		}
	
		int lastRowNo = mysheet.getLastRowNum();
		int totalrowCount = lastRowNo;
		
		int lastcellnum = mysheet.getRow(0).getLastCellNum();
		int totalcellCount = lastcellnum-1;
		System.out.println(totalrowCount);
		System.out.println(totalcellCount);
		
		// By using dynamic coding
		for (int i=0; i<=totalcellCount; i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
			
		}
	 
	
	}

}
