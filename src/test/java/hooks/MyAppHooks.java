package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.Before;
import qa.DriverFactory;

public class MyAppHooks {
	
	@Before
	public void launchBrowser() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream filePath=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(filePath);
		DriverFactory df=new DriverFactory();
		df.initBrowser(prop.getProperty("browser"));
	}

}
