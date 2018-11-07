package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSky.HomePage;

public class DarkSkySD {

    HomePage darkSkyHomePage = new HomePage();


    @Given("^I am on Dark Sky webpage$")
    public void iAmOnDarkSkyWebpage() throws Throwable {
        //BeforeClass method already opening the web page
    }

    @When("^I enter zip code as (\\d+)$")
    public void enterZipCodeAsLocation(int zipCode) throws Throwable {
        darkSkyHomePage.enterLocation(zipCode);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() throws Throwable {
        darkSkyHomePage.clickOnSearchButton();
    }

    @Then("^I verify present temperature is between lowest and highest$")
    public void iVerifyPresentTemperatureIsBetweenLowestAndHighest() throws Throwable {
        darkSkyHomePage.verifyPresentTempBetweenLowHigh();
    }



}
