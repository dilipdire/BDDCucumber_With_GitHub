package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	 WebDriver ldriver;

	  public LoginPage(WebDriver rdriver)
	  {
	      ldriver=rdriver;
	      PageFactory.initElements(rdriver , this);
	  }
	   @FindBy(xpath =  "//*[@class='ico-login']")
	    WebElement loginLink;
	    @FindBy(id = "Email")
	    WebElement email;
	    @FindBy(id = "Password")
	    WebElement password;
	    @FindBy(xpath = "//button[text()='Log in']")
	    WebElement clickOnLogin;
	    @FindBy(xpath = "//h2[text()='Welcome to our store']")
	    WebElement welcomePage;

	    @FindBy(xpath = "//a[text()='Log out']")
	    WebElement logoutLink;

	    public void selectLoginLink() throws InterruptedException
	    {
	    	Thread.sleep(10);
	    	loginLink.click();
	    }
	    public void getUsername_Password(String user, String pwd)
	    {
	    	email.clear();
	        email.sendKeys(user);
	        password.clear();
	        password.sendKeys(pwd);
	        

	    }

	    public void clickOnLoginBTN()
	    {
	        clickOnLogin.click();
	    }

	    public void getWelcomePage()
	    {
	        welcomePage.click();
	    }
		/*
		 * public void getLogOut() { logoutLink.click();
		 * 
		 * }
		 */
}
