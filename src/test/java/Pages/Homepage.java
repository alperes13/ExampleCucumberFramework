package Pages;

import Utitiles.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends HelperFunctions{

    public Homepage(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    public WebElement mainElement;

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(css = "[type='submit']")
    private WebElement searchButton;

    public void findAndSend(String element, String value){

        switch (element){
            case "searchInput":
                mainElement = searchInput;
                break;
        }

        sendKeysFunction(mainElement,value);

    }

    public void findAndClick(String element){

        switch (element){
            case "searchButton":
                mainElement = searchButton;
                break;
        }

        clickFunction(mainElement);

    }


}
