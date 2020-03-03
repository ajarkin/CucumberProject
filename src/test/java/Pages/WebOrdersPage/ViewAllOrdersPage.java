package Pages.WebOrdersPage;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage {
    public ViewAllOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//h2")
        public WebElement listOfOrders;
    }

