package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;



public class Testbase_viki{
		WebDriver driver;
		public vikipages vp;
		SoftAssert SAssert;
		@Parameters({"Browser","Url"})
		@BeforeClass
		public void setUp(String Browser,String Url)
		{
			if(Browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "H:\\\\chromedriver_win32\\\\chromedriver.exe");
				driver =new ChromeDriver();
			}
		vp= new vikipages(driver);
	    driver.get(Url);
			
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
		

		

}
