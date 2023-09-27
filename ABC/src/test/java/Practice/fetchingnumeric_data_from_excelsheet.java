package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchingnumeric_data_from_excelsheet {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\ABC\\src\\test\\resources\\raju1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double d = wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(d);
		}

}
