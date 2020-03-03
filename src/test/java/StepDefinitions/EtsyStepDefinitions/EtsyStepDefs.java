package StepDefinitions.EtsyStepDefinitions;

import Pages.EtsyPage.EtsyHomePage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EtsyStepDefs {

    WebDriver driver= Driver.getDriver();

    EtsyHomePage etsyPage=new EtsyHomePage();
    @Given("navigate to the etsy website")
    public void navigate_to_the_etsy_website() {
      driver.get(ConfigReader.getProperty("etsy"));
    }

    @Given("search for {string}")
    public void search_for(String string) {
      etsyPage.searchField.sendKeys(string+ Keys.ENTER);
     // etsyPage.searchButton.click();
    }

    @Given("validate title is {string}")
    public void validate_title_is(String string) {
        Assert.assertEquals(driver.getTitle(),string);
    }




}
