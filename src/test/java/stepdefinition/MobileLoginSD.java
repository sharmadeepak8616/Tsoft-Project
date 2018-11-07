package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.FavouritesPage;
import framework.mobile_pages.LandingPage;
import framework.mobile_pages.LoginPage;
import org.testng.Assert;


public class MobileLoginSD {

    LandingPage landingPage = new LandingPage();
    FavouritesPage favouritePage = new FavouritesPage();

    @When("^I click on skip button")
    public void clickOnSkipButton() {
        landingPage.tapOnSkipButton();
    }

    @When("^I click on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        landingPage.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(landingPage.isSideMenuBarDisplayed());
    }


    @And("^I click on favourites button$")
    public void clickOnFavouritesButton() throws InterruptedException {
        Thread.sleep(30000);
        landingPage.tapOnFavouritesButton();
    }


    @Then("^I verify \"(.+)\" text displayed$")
    public void verifyNoSessionsFoundText(String message) throws InterruptedException {
        Thread.sleep(30000);
        //Assert.assertTrue(favouritePage.isNoSessionsFoundDisplayed());
        String messageFound = favouritePage.getNoSessionsFoundText();
        Assert.assertEquals(message, messageFound, "Message mismatch : Found: " + messageFound + "-- Expected: " + message);

    }




}
