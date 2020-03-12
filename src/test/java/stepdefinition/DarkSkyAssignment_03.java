package stepdefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import org.testng.Assert;

public class DarkSkyAssignment_03 extends BasePage {


    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkskyHomePage()  {
        System.out.println(SharedSD.getDriver().getTitle());
      //  Assert.assertEquals(SharedSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

    @When("^I expand todays timelineFeature: Login feature$")
    public void iExpandTodaysTimelineFeatureLoginFeature() {

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly() {

    }



}
