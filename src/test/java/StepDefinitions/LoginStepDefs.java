package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	
	private WebDriver driver;

    public LoginStepDefs(SharedSteps sharedSteps) {
        this.driver = sharedSteps.getDriver();
    }
    @Given("I am on the after login home page")
    public void iAmOnTheHomePage() {
     
        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
        driver.findElement(By.cssSelector("a.ico-login")).click();
    }

    @And("I will enter the {string} in Email tab")
    public void iWillEnterTheEmailIDInEmailTab(String email) {
         driver.findElement(By.id("Email")).sendKeys(email);
        
    }

    @And("I will enter the {string} in Password tab")
    public void iWillEnterThePasswordInPasswordTab(String password) {
      driver.findElement(By.id("Password")).sendKeys(password);
       
    }

    @And("I will click on the Login button")
    public void iWillClickOnTheLoginButton() {
         driver.findElement(By.className("login-button")).click();
        
    }

    @Then("It should get login and show {string}")
    public void itShouldGetLoginAndShowStatus(String status) {
       System.out.println("Login is"+status);
    }


}
