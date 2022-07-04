package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File MyFile = new File("D:\\Velocity\\Test Case Apache.xlsx");
		
		String number = WorkbookFactory.create(MyFile).getSheet("Student").getRow(0).getCell(0).getStringCellValue();
		System.out.println(number);
		
		String name = WorkbookFactory.create(MyFile).getSheet("Student").getRow(1).getCell(1).getStringCellValue();
		System.out.println(name);
		
	  double num1 = WorkbookFactory.create(MyFile).getSheet("Student").getRow(1).getCell(3).getNumericCellValue();
	  System.out.println(num1);
	  
	  double num2 = WorkbookFactory.create(MyFile).getSheet("Student").getRow(3).getCell(3).getNumericCellValue();
	  System.out.println(num2);
	  
	  boolean value = WorkbookFactory.create(MyFile).getSheet("Student").getRow(1).getCell(6).getBooleanCellValue();
	  System.out.println(value);
	  
	  boolean value1 = WorkbookFactory.create(MyFile).getSheet("Student").getRow(4).getCell(6).getBooleanCellValue();
	  System.out.println(value1);
	  
	  
	}

}
