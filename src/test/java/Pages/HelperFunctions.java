package Pages;


import Utitiles.GWD;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperFunctions {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));


    public void sendKeysFunction(WebElement element, String value) {
        waitVisibilityOf(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilElementToBeClickable(element);
        element.click();
    }

    public void validateFunction(WebElement element, String value) {

        waitVisibilityOf(element);

        Assert.assertTrue(element.getText().trim().equalsIgnoreCase(value));

    }


    public void waitVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
