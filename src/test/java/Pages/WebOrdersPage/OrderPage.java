package Pages.WebOrdersPage;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage {

public OrderPage (){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

@FindBy(xpath = "//li//table//td")
    public List<WebElement> cards;
@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardnUmber;
@FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiration;
@FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
public WebElement processBtn;

 public void selectCard(String cardName) {
     switch (cardName) {
         case "Visa":
             this.cards.get(0).click();
             break;
         case "Master Card":
             this.cards.get(1).click();
             break;
         case "American Express":
             this.cards.get(2).click();
             break;

     }

 }}