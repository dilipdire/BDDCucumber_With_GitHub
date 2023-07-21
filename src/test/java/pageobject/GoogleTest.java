package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleTest { 

	WebDriver ldriver;

	

	  public GoogleTest(WebDriver rdriver)
	  {
	      ldriver=rdriver;
	      PageFactory.initElements(rdriver , this);
	  }

	@FindBy(id = "APjFqb")
	WebElement serchname;
	@FindBy(xpath = "(//*[@class='gNO89b'])[2]")
	WebElement clickOnSrchBTN;
	

	public void getEnterText(String string)
	{
		serchname.sendKeys(string);
	}
	public void clickOnSearch() {

		clickOnSrchBTN.click();
	}
}
