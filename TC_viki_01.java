package practice;

import org.testng.annotations.Test;


public class TC_viki_01 extends Testbase_viki {
	@Test(priority=1)
	public void login1()
	{
		vp.getloginlink().click();
		vp.getEmailIdTextFild().sendKeys("snigdha@gmail.com");
		vp.getpasswordFild().sendKeys("snigdha");
		vp.getcontinuebox().click();
	
		
	}

}
