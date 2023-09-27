package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class data_driven_testing {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\html\\credentials.properties"); 
		Properties p=new Properties();
		p.load(fis);
		String un = p.getProperty("pwd");
		System.out.println(un);
		}

}
