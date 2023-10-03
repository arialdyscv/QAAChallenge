package utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {

    public static void ScrollDown(WebDriver driver, String X, String Y){
        JavascriptExecutor JsE = (JavascriptExecutor) driver;
        JsE.executeScript("window.scrollBy("+X+","+Y+")");
    }
}
