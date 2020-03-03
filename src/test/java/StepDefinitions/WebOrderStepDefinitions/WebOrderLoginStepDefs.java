package StepDefinitions.WebOrderStepDefinitions;
import Pages.WebOrdersPage.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderLoginStepDefs {
    WebDriver driver= Driver.getDriver();
    LoginPage page=new LoginPage();
    @Given("the user navigate to the web orders page")
    public void the_user_navigate_to_the_web_orders_page() {
        driver.get(ConfigReader.getProperty("url"));
        System.out.println("navigated to web order page");
    }

    @When("the user provide valid username")
    public void the_user_provide_valid_username() {

        page.username.sendKeys(ConfigReader.getProperty("username"));
        System.out.println("The user sent Tester");

    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        LoginPage page=new LoginPage();
        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginBtn.click();;
        System.out.println(    "User send valid password Test");

    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        String expectedTitle="Web Orders";
        String actualTitle=driver.getTitle();
        System.out.println("User validate home page");
        Assert.assertEquals(actualTitle,expectedTitle);

    }


    @When("the user provide username {string}")
    public void the_user_provide_username(String username) {
        page.username.sendKeys(username);
    }

    @When("the user provide password {string}")
    public void the_user_provide_password(String password) {
       page.password.sendKeys(password);
       page.loginBtn.click();
    }

    @Then("the user validate text {string}")
    public void the_user_validate_text(String errorMessage) {
        String actual=page.errMessage.getText();
       Assert.assertEquals(actual,errorMessage);
    }


    @When("the user provide username {int}")
    public void the_user_provide_username(Integer username) {
        page.username.sendKeys(""+username);
    }

    @When("the user provide password {int}")
    public void the_user_provide_password(Integer password) {
        page.password.sendKeys(password.toString());
        page.loginBtn.click();

    }

    @When("the user provide username {string} and password {string}")
    public void the_user_provide_username_and_password(String string, String string2) {
        page.username.sendKeys(string);
        page.password.sendKeys(string2);
        page.loginBtn.click();
    }








}
