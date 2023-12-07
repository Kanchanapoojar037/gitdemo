package Stepdefinitions;

import  Factory.DriverFactory;
import Pages.DataStructurePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datastructurepagesteps {
	private DataStructurePage datapage=new DataStructurePage(DriverFactory.getDriver());
	@Given("Browser is open")
	public void browser_is_open() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}
	@When("user clicks on get started")
	public void user_clicks_on_get_started() {
datapage.getstartbtn();
	}
	@When("when user enters signin button")
	public void when_user_enters_signin_button() {
	    datapage.signinbtn();
	}

	@When("user enter correct username as {string}")
	public void user_enter_correct_username_as(String usernam) {
	   datapage.username(usernam);
	}

	@When("user enter correct password as {string}")
	public void user_enter_correct_password_as(String passwod) {
	   datapage.password(passwod);
	}

	@When("user click login button")
	public void user_click_login_button() {
	    datapage.loginbtn();
	}

	@Then("it should go to home page by showing username on top")
	public void it_should_go_to_home_page_by_showing_username_on_top() {
	   System.out.println("success");
	}
	
	
	@Then("The user open the home page")
	public void the_user_open_the_home_page() {
	   System.out.println("Successfully open login page");
	}

	@When("user clicks on datatructure  get started")
	public void user_clicks_on_datatructure_get_started() {
	    datapage.datastructuregetstartbtn();
	}

	@Then("it should go to data structure home page")
	public void it_should_go_to_data_structure_home_page() {
	    System.out.println("sucessfully opend datastructure home page");
	}
	@When("user click Time Complexity button")
	public void user_click_time_complexity_button() {
	    datapage.Timecomplxbtn();
	}

	@Then("it should go to data structure time-complexity page")
	public void it_should_go_to_data_structure_time_complexity_page() {
	    System.out.println("sucessfully opened timecomplexity page");
	}

	@Then("user click on practice button")
	public void user_click_on_practice_button() {
	    datapage.practicequ();
	}
	@Then("it should go to practice question page")
	public void it_should_go_to_practice_question_page() {
	    System.out.println("successfully opened practice question page");
	}
	@Then("user click on Try here button")
	public void user_click_on_try_here_button() {
	   datapage.TryHereBtn();
	}

	@Then("user enter correct code as {string}")
	public void user_enter_correct_code_as(String codes ) {
	    datapage.code(codes);
	}

	@Then("user click run button")
	public void user_click_run_button() {
	    datapage.runbt();
	}

	@Then("user seeing output of code")
	public void user_seeing_output_of_code() {
	    System.out.println("successfully output display");
	}


}
