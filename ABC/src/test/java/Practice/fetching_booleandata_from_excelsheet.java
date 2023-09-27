package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetching_booleandata_from_excelsheet {
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ABC\\src\\test\\resources\\raju3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
		String d = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		System.out.println(d);
		}

}


