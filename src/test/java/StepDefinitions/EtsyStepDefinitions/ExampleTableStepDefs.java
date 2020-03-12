package StepDefinitions.EtsyStepDefinitions;

import Pages.EtsyPage.EtsyHomePage;
import Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ExampleTableStepDefs {
    EtsyHomePage etsyHomePage=new EtsyHomePage();
    WebDriver driver= Driver.getDriver();

    @When("user search with {string}")
    public void user_search_with_wooden_spoon(String SearchValue) {
    etsyHomePage.searchField.sendKeys(SearchValue);
    etsyHomePage.searchButton.click();
    }

    @Then("user validate the {string}")
    public void user_validate_the_Wooden_spoon_Etsy(String ExpectedTitle) {
        String actual=driver.getTitle();
        Assert.assertEquals(actual,ExpectedTitle);
    }





}
