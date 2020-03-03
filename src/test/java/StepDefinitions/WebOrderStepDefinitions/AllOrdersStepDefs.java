package StepDefinitions.WebOrderStepDefinitions;

import Pages.WebOrdersPage.ViewAllOrdersPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class AllOrdersStepDefs {
ViewAllOrdersPage viewAllOrders=new ViewAllOrdersPage();


    @Given("the user validate {string} header is displayed")
    public void the_user_validate_header_is_displayed(String string) {
        Assert.assertEquals(viewAllOrders.listOfOrders.getText(),string);
    }


}
