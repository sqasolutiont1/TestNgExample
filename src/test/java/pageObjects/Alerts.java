package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonPage {

    public void navigateToAlertPage() {
        navigate();
        getClickableElement(By.cssSelector("[title='UI Elements']")).click();
        getClickableElement(By.cssSelector("[title='Alerts & Notifications']")).click();
        waitForPageLoad();
    }

    public String getHeader() {
        waitForPageLoad();
        return getClickableElement(By.cssSelector("h1")).getText();
    }

    public void fillinTextField(String messageText) {
        By locator = By.cssSelector("[ng-model='newNotification']");
        WebElement element = getClickableElement(locator);
        element.clear();
        element.sendKeys(messageText);
    }

    public void pressAddNotificationBtn() {
        By locator = By.cssSelector("[ng-click='add(newNotification)']");
        getClickableElement(locator).click();
    }

    public String readNotification(String messageText) {
        By locator = By.xpath("//*[@class='ng-scope ng-binding'][contains(text(),'" + messageText + "')]");
        return getClickableElement(locator).getText();
    }
}
