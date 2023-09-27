package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriventesting_from_xl_sheet {


	public static void main(String[] args) throws Throwable {
		//create object of fis
		
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ABC\\src\\test\\resources\\raju.xlsx");
		//open the work book using crete method
	Workbook wb=WorkbookFactory.create(fis);
		//navigate to sheet
		Sheet sh=wb.getSheet("Sheet1");
		//navigate to rows and cells
		 String data = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}

