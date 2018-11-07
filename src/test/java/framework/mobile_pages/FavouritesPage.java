package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FavouritesPage extends MobileBasePage {

    @AndroidFindBy(accessibility = "No Sessions Found")
    private MobileElement noSessionsFound;

    public String getNoSessionsFoundText() {
        return getAttributeOfAnElement(noSessionsFound, "contentDescription");
    }

    public boolean isNoSessionsFoundDisplayed() {
        return isElementDisplayed(noSessionsFound);
    }


















}
