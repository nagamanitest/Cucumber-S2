package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SharedSteps {
	
	 private WebDriver driver;

	    @Before
	    public void setup(Scenario scenario) {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "D:\\Cucumber-S2\\PS1\\drivers\\windows\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }

	    @After
	    public void tearDown() {
	        //Browser close
	        driver.quit();
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
	
}
