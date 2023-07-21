package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.AfterStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.GoogleTest;

public class StepDef {

	public WebDriver driver;
	public GoogleTest text ;
	@Given("Lunch Browser")
	public void lunch_browser() {
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 text = new GoogleTest(driver);
	    
	}


	@Given("Open google page {string}")
	public void open_google_page(String url) {
		
		driver.get(url);

	}
	@When("Search any thing")
	public void search_any_thing() {
		System.out.println("Hello");
	    
		text.getEnterText("Dilip Kumar");
	}


	@When("Click on Search button")
	public void click_on_search_button() {
		
		text.clickOnSearch();

	}

	/*
	 * @AfterStep public void addSreenshot(Scenario scenario1) { if(
	 * scenario1.isFailed()) { final byte[]
	 * screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 * 
	 * scenario1.attach(screenshot,"image/png",scenario1.getName()); }
	 * 
	 * }
	 */
}
