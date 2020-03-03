package StepDefinitions.WebOrderStepDefinitions;

import Pages.WebOrdersPage.HomePage;
import Pages.WebOrdersPage.ProductPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AllProductsStepDefs {
    HomePage homePage=new HomePage();
    ProductPage productPage=new ProductPage();

    @Then("the user click view all products button")
    public void the_user_click_view_all_products_button() {
        homePage.viewAllProducts.click();

    }

    @Then("the user validate product table")
    public void the_user_validate_product_table() {
      List <String> actualList=productPage.getProductList();
      List<String > expectedList=productPage.expectedData();
      //Assert.assertEquals(actualList,expectedList);
    Assert.assertTrue(actualList.containsAll(expectedList));
    }


}
