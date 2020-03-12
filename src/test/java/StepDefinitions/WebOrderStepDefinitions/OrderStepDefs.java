package StepDefinitions.WebOrderStepDefinitions;
import Pages.WebOrdersPage.HomePage;
import Pages.WebOrdersPage.OrderPage;
import Pages.WebOrdersPage.ViewAllOrdersPage;
import Utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

public class OrderStepDefs {
    HomePage homePage=new HomePage();
    OrderPage orderPage=new OrderPage();
ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();

    @Given("the user click order button")
    public void the_user_click_order_button() {
  // homePage.orderBtn.click();
    }

    @Given("the user select product {string}")
    public void the_user_select_product(String product) {
        BrowserUtils.selectByVisibleText(orderPage.product,product);

    }
    @Given("the user  give the {string}")
    public void the_user_give_the(String quantity) {
       orderPage.quantity.sendKeys(quantity);
    }
    @Then("the user choose the {string}")
    public void the_user_choose_the(String card) {
     orderPage.selectCard(card);
    }
    @When("the user provide {string}")
    public void the_user_provide(String cardNumber) {
        orderPage.cardnUmber.sendKeys(cardNumber);

    }
    @When("the user enter expiration date {string}")
    public void the_user_enter_expiration_date(String expiration) {
        orderPage.expiration.sendKeys(expiration);
    }
    @Then("the user clicks process button")
    public void the_user_clicks_process_button() {
        orderPage.processBtn.click();
    }

 //   @Then("the user click view all orders button")
 //   public void the_user_click_view_all_orders_button() {
  //      homePage.viewAllOrdersBtn.click();
//
//    @Then("the user validate updated order info {string} {string} {string} {string} {string} {string} {string}")
//    public void the_user_validate_updated_order_info(String product, String quantity, String customer, String street, String city, String state, String zip) {
//        List<WebElement> orderInfoS=viewAllOrdersPage.orderInfo;
//
//
//        String actualCustomerName=orderInfoS.get(1).getText();
//        String actualStreet=orderInfoS.get(5).getText();
//        String actualCity=orderInfoS.get(6).getText();
//        String actualState=orderInfoS.get(7).getText();
//        String actualZip=orderInfoS.get(8).getText();
//        String actualProductName=orderInfoS.get(2).getText();
//        String actualQuantity=orderInfoS.get(3).getText();
//        Assert.assertTrue(actualProductName.equals(product));
//        Assert.assertTrue(actualQuantity.equals(quantity));
//        Assert.assertTrue(actualCustomerName.equals(customer));
//        Assert.assertTrue(actualStreet.equals(street));
//        Assert.assertTrue(actualCity.equals(city));
//        Assert.assertTrue(actualState.equals(state));
//        Assert.assertTrue(actualZip.equals(zip));
//
//
//         /*
//       Assert.assertTrue(productInfo.get(1).getText().equals(customer));
//        Assert.assertTrue(productInfo.get(2).getText().equals(product));
//        Assert.assertTrue(productInfo.get(3).getText().equals(quantity));
//        Assert.assertTrue(productInfo.get(5).getText().equals(street));
//        Assert.assertTrue(productInfo.get(6).getText().equals(city));
//        Assert.assertTrue(productInfo.get(7).getText().equals(state));
//        Assert.assertTrue(productInfo.get(8).getText().equals(zip));
//        Assert.assertTrue(productInfo.get(9).getText().equals(card));
//        Assert.assertTrue(productInfo.get(10).getText().equals(cardNumber));
//        Assert.assertTrue(productInfo.get(11).getText().equals(expiration));
//         */
//
//
//
//    }



}
