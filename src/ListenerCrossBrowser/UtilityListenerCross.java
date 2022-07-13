package ListenerCrossBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityListenerCross {
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\Atul\\workspace-eclipse\\26selenium\\src\\PracticeKitePOM\\MyProperties1.properties");

		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
		
	}

}
