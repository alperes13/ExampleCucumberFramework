package Utitiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWD {

    public static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

        }

        return driver;

    }

    public static void quitDriver(){

        waitForSeconds(2);

        if(driver != null){

            driver.quit();

            driver = null;
        }

    }

    public static void waitForSeconds(int second){

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
