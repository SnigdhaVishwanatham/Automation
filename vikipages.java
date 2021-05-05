package practice;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vikipages {
	public WebDriver driver;
	public vikipages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}
	@FindBy(linkText="Log in")
	WebElement loginlink;
	public WebElement getloginlink()
	{
		return loginlink;
	}
	@FindBy(xpath="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[1]/label[1]/input[1]")
	 WebElement EmailIdTextFild;
   
   public WebElement getEmailIdTextFild() {
   	return EmailIdTextFild;
   }
   @FindBy(xpath="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[2]/form[1]/div[2]/label[1]/input[1]")
	 WebElement passwordFild;
 
   public WebElement getpasswordFild() {
 	return passwordFild;
    }
    @FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebox;
    public WebElement getcontinuebox(){
		return continuebox;
	}
    @FindBy(xpath="//body/div[@id='__next']/div[1]/div[2]/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/div[1]/i[2]")
    WebElement searchbtn;
    public WebElement getsearchbtn()
    {
    	return searchbtn;
    }
    @FindBy(xpath="//body/div[@id='__next']/div[1]/div[2]/nav[1]/div[1]/ul[2]/li[1]/div[1]/div[1]/input[1]")
    WebElement SearchBox;
    public WebElement getSearchBox()
    {
    	return SearchBox;
    }
    @FindAll(@FindBy(tagName="div"))
    List<WebElement> Suggestions;
    public List<WebElement>Suggestions()
    {
    	return Suggestions;
    }
   /* @FindAll(@FindBy(xpath="//h1[contains(text(),'True Beauty')]"))
	List<WebElement> TitleoftheMovie;
	public List<WebElement> getTitleoftheMovie()
	{
		return TitleoftheMovie;
	}*/
    
    @FindBy(xpath="//body/div[1]/nav[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement searchbtn2;
    public WebElement getsearchbtn2()
    {
    	return searchbtn2;
    }
  
    
    
}
