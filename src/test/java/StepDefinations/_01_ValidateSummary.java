package StepDefinations;

import Pages.Documents;
import Pages.Homepage;
import Utitiles.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_ValidateSummary {
    @Given("User navigate to wikipedia")
    public void userNavigateToWikipedia() {

        GWD.getDriver().get("https://www.wikipedia.org/");
        GWD.getDriver().manage().window().maximize();
        GWD.getDriver().manage().deleteAllCookies();



    }

    @When("User search for {string} and click search button")
    public void userSearchForAndClickSearchButton(String arg0) {

        Homepage homepage = new Homepage();

        homepage.findAndSend("searchInput",arg0);
        homepage.findAndClick("searchButton");


    }

    @Then("User must to see {string} in summary")
    public void userMustToSeeInSummary(String arg0) {

        Documents documents = new Documents();

        documents.findAndValidate("summary",arg0);

    }
}
