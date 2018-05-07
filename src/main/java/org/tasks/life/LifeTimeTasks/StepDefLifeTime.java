package org.tasks.life.LifeTimeTasks;

import org.openqa.selenium.interactions.Actions;
import org.tasks.life.resources.LifeTimePages;
import org.tasks.life.resources.Utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefLifeTime {
	@Given("^user selects \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" and navigates to Lifetime website$")
	public void user_selects_and_and_navigates_to_Lifetime_website(String browserName, String browserDescription,
			String driverLocation) throws Throwable {
		Utilities.browserOpen(browserName, browserDescription, driverLocation);
		Utilities.launchApp("https://www.lifetime.life");
	}

	@When("^user navigates to basketball tab under the sports tab$")
	public void user_navigates_to_basketball_tab_under_the_sports_tab() throws Throwable {
		// Actions act = new Actions(Utilities.driver);
		LifeTimePages.navigateToBasketBall();
	}

	@Then("^user verifies the message 'premier Basketball Court' is available or not$")
	public void user_verifies_the_message_premier_Basketball_Court_is_available_or_not() throws Throwable {
		Assert.assertEquals("Premier Basketball Courts", LifeTimePages.verifyText());
		LifeTimePages.browserClose();
	}

}
