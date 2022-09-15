package Pages;

import Utitiles.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents extends HelperFunctions{

    public Documents(){

        PageFactory.initElements(GWD.getDriver(),this);

    }

    public WebElement mainElement;

    @FindBy(id = "firstHeading")
    private WebElement summary;


    public void findAndValidate(String element, String value){

        switch (element){
            case "summary":
                mainElement = summary;
                break;
        }

        validateFunction(mainElement,value);

    }

}
