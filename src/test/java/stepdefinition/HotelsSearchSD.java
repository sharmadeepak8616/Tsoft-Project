package stepdefinition;

import cucumber.api.java.en.When;
import framework.web_pages.HotelLandingPage;

public class HotelsSearchSD {

    private HotelLandingPage landingPage = new HotelLandingPage();

    @When("^I select destination as (.+)$")
    public void selectDestination(String city) {
        landingPage.enterDestination(city);
    }
}
