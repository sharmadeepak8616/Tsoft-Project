package framework.web_pages.DarkSky;

import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage  extends BasePage {

    private By textInputField = By.xpath("//form[@id='searchForm']//input");
    private By searchButton = By.xpath("//a[@class='searchButton']");
    private By presentTemperature = By.xpath("//span[@class='currently']//span[@class='summary swap']");
    private By temperatureLow = By.xpath("//span[@class='summary-high-low']/span[2]");
    private By temperatureHigh = By.xpath("//span[@class='summary-high-low']/span[3]");

    public void enterLocation(int enterLocation) {
        String location = Integer.toString(enterLocation);
        clearText(textInputField);
        sendText(textInputField, location);
    }

    public void clickOnSearchButton() {
        clickOn(searchButton);
    }

    private int getPresentTemperature() {
        String presentTempLine = getTextFromElement(presentTemperature);

        return Integer.parseInt(presentTempLine.split("˚")[0]);
    }

    private int getLowTemperature() {
        return getLowHighTempValue(getTextFromElement(temperatureLow));
    }

    private int getHighTemperature() {
        return getLowHighTempValue(getTextFromElement(temperatureHigh));
    }

    private int getLowHighTempValue(String line) {
        String temp = line.split(":")[1];
        temp = temp.split("˚")[0];
        return Integer.parseInt(temp.trim());
    }

    public void verifyPresentTempBetweenLowHigh() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        int present = getPresentTemperature();
        int low = getLowTemperature();
        int high = getHighTemperature();
        Assert.assertTrue(low <= present && present <= high, "Present temp (" + present + "˚) is not in between low (" + low + "˚) and high (" + high + "˚)");

    }






}
