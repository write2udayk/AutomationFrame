package Sample_Properties;

import java.io.FileInputStream;
import java.util.Properties;

import generic_Utility.Properties_Utility;


public class Sample_properties {
	public static void main(String[] args) throws Exception {
		
		FileInputStream lif=new FileInputStream("D:\\Selenium\\Program_1.properties");
		Properties pobj =new Properties();
		pobj.load(lif);
		
		String URL=pobj.getProperty("url");
		String UNAME=pobj.getProperty("username");
		String PASS= pobj.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UNAME);
		System.out.println(PASS);
		
		
//		Properties_Utility pp=new Properties_Utility();
//		System.out.println( pp.getDataFromProperties("username"));
		
	}

}
