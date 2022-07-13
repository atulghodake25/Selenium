package PracticeKitePOM;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp1 {
	

	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\Atul\\workspace-eclipse\\26selenium\\src\\PracticeKitePOM\\MyProperties1.properties");

		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
		
	}

	
	

}
