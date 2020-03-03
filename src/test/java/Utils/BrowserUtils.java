package Utils;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    static public void switchWindow( String targetTitle){
        String mainWindow=Driver.getDriver().getWindowHandle();
        Set<String> allWindows=Driver.getDriver().getWindowHandles();
        //internet
        //targetTitle=new Window
        if(!Driver.getDriver().getTitle().equals(targetTitle)){
            for(String window: allWindows){
                Driver.getDriver().switchTo().window(window);
                if(Driver.getDriver().getTitle().equals(targetTitle)){
                    break;
                }
            }

        }


    }

    @Test
    public static void verifyBrokenLink(List<WebElement> links) {
        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");

            try {
                URL url = new URL(hrefValue);
                HttpURLConnection connect = (HttpURLConnection) url.openConnection();
                connect.setConnectTimeout(3000);
                connect.connect();
                if (connect.getResponseCode() >= 400 || connect.getResponseCode() >= 500) {
                    System.out.println(links.toString());
                    System.out.println("The link is broken " + connect.getResponseMessage() + " " +
                            connect.getResponseCode());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void hoverOver( WebElement element){
        //driver, element
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(element).build().perform();
    }



    public static void dragAndDrop( WebElement from, WebElement to){
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(from,to).build().perform();

    }

    public static WebElement waitForVisibility(WebElement element, int timeUnit){
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),timeUnit);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }


    public static WebElement waitForVisibility(By locator, int timeUnits){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeUnits);
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement fluentWait(WebElement element,int timeUnit, int polling){
        Wait<WebDriver> wait=new FluentWait<>(Driver.getDriver())
                .withTimeout(timeUnit, TimeUnit.SECONDS)
                .pollingEvery(polling,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement element1=wait.until(
                driver -> element


        );return element1;
    }

    public static void selectByVisibleText(WebElement element, String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }



    public static void waitForSec(int time){
        time=time*1000;
        try{
            Thread.sleep(time);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void takeScreenShot() throws IOException {
        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File desFile=new File("ScreenShotFile/"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(src,desFile);

    }
    public static WebElement waitForClickable (By locator, int timeUnit){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeUnit);

        return wait.until(ExpectedConditions.elementToBeClickable(locator));

    }







}