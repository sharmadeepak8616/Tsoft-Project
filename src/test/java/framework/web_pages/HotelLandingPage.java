package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HotelLandingPage extends BasePage {

    private By destinationTextField = By.id("qf-0q-destination");

    @Step
    public void enterDestination(String city) {
        sendText(destinationTextField, city);
    }
}
