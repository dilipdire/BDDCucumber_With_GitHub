package StepDefinition;



import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPage;

public class LoginStepDef extends BaseClass {

	
	public WebDriver driver;
    public LoginPage login;
	ChromeOptions option = new ChromeOptions();


    @Given("User Lunch chrome browser")
    public void user_lunch_chrome_browser() {
       log =LogManager.getLogger("LoginStepDef");
         WebDriverManager.chromedriver().setup();
         option.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(option);
         log.info("user_lunch_chrome_browser------------------------------------------");
         login = new LoginPage(driver);


    }

    @When("User open loginurl")
    public void user_open_url()
    {
    	
        driver.get("https://demo.nopcommerce.com/login");
        

    }

    @When("User Select login Link")
    public void user_select_login_link() throws InterruptedException {
    	
    	
    
      //  login.selectLoginLink();
    
    }


    @When("User Enter Valid user name {string} and password {string}")
    public void user_enter_valid_user_name_and_password(String uName, String uPwd) {

        login.getUsername_Password(uName,uPwd);

    }

    @When("Click o Login button")
    public void click_o_login_button() {
       login.clickOnLoginBTN();
    }

    @Then("Open Dashboard {string}")
    public void open_dashboard(String expText) {

        String actText= driver.getTitle();
        System.out.println(actText);


    }

    @When("User Select logOut Link")
    public void user_select_log_out_link() {
        //login.getLogOut();
    	
    	System.out.println("Logout");

    }

    @Then("Page Title should be logout")
    public void page_title_should_be_logout() {

    }

    @Then("Close the Browser")
    public void close_the_browser() {

        driver.close();

    }
    
    @AfterStep
	public void addSreenshot(Scenario scenario)
	{
    	if(scenario.isFailed())
    	{
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot,"image/png",scenario.getName());
    	}
		          
	}
	

}
