package stepDefinations;
    import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class stepDefination {

	    @Given("^User is on net banking landing page$")
	    public void user_is_on_net_banking_landing_page() throws Throwable {
	        
	        System.out.println("login");
	    }

	    @When("^User login to application with Username and Password$")
	    public void user_login_to_application_with_username_and_password() throws Throwable {
	        System.out.println("user logged in sucessfully");

	        
	    }
	    

	    @Then("^Home Page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        throw new PendingException();
	    }

	}

