package runners;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetStepDefinition {
	
	private String baseURL="http://ergast.com/api";
	Response r;
	
	@Given("a user should be on ApiPage")
	public void a_user_should_be_on_api_page() {
		
		RestAssured.baseURI=baseURL;
		
	    
	}

	@When("a user retrieved")
	public void a_user_retrieved() {
	r=	RestAssured.given().get("/f1/2018/circuits.json");
	    
	}

	@Then("validate the outcomes status code is {int}")
	public void validate_the_outcomes_status_code_is(int exstatuscode) {
		int actualcode=r.getStatusCode();
		System.out.println(actualcode);
		Assert.assertEquals(exstatuscode, actualcode);
	   
	}
	
	@Then("check outcomes response with following")
	public void check_outcomes_response_with_following() {
		
	    System.out.println(r.asPrettyString());
	    
	    r.then().assertThat().
	    body("MRData.limit", equalTo("30")).
	    body("MRData.CircuitTable.season", equalTo("2018"));
	    
	}


}
