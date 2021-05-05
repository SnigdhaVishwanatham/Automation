package practice;


import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class TC_viki extends Testbase_viki{
	@Test(priority=1)
	public void login()
	{
		vp.getloginlink().click();
		vp.getEmailIdTextFild().sendKeys("snigdha.vishwanatham@gmail.com");
		vp.getpasswordFild().sendKeys("sniggy12");
		vp.getcontinuebox().click();
	
		
	}
	@Test(priority=2,dataProvider="getData")
	public void SearchItem(String Input) throws InterruptedException {
		
		vp.getsearchbtn().click();
		vp.getSearchBox().clear();
		vp.getSearchBox().sendKeys(Input);
		//new Select (vp.getSearchBox()).selectByVisibleText(Input);
		vp.getSearchBox().click();
		driver.navigate().back();
		//vp.getSearchBox().submit();
		Thread.sleep(2000);
		
	}

	@DataProvider
	public String[][] getData() throws IOException {
		String xlPath ="H:\\New folder\\office\\SeleniumAutomation\\src\\test\\java\\practice\\New folder\\Work1.xlsx";
		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++)

			{
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
	}

}
