package StepDefinition;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageobject.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
    public LoginPage login;
	ChromeOptions option = new ChromeOptions();
	
	public static Logger log;

}
