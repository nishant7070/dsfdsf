package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestMeApp {
	@Given("User enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(Lalitha);
	}

	@Given("the password {string}")
	public void the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		
	}

	@Then("clicks on Sign")
	public void clicks_on_Sign() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on Allcategories")
	public void clicks_on_Allcategories() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("clicks on Electronics")
	public void clicks_on_Electronics() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("clicks on Headphone")
	public void clicks_on_Headphone() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on Floor")
	public void clicks_on_Floor() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("clicks on add to cart Button")
	public void clicks_on_add_to_cart_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on Remove Button")
	public void clicks_on_Remove_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("enter login credentials")
	public void enter_login_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
	}

}
