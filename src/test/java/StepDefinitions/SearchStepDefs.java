package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchStepDefs {
	
	private WebDriver driver;

    public SearchStepDefs(SharedSteps sharedSteps) {
        this.driver = sharedSteps.getDriver();
    }
    
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("I type {string} in search textbox")
    public void iTypeSearchTextInSearchTextbox(String searchText) throws Throwable {
        WebElement searchInput = driver.findElement(By.id("small-searchterms"));
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() throws Throwable {
        driver.findElement(By.className("search-box-button")).click();

    }
    

}
