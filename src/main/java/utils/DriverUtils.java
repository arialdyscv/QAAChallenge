package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void starChrome() {
        // INICIAR EL DRIVER
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        System.out.println("Iniciando explorador Chrome...");
    }

    public static void closeDriver() {
        // CERRAR EL DRIVER
        System.out.println("Cerrando driver...");
        driver.quit();
    }

    public static void goTo(String url) {
        System.out.println("Navegando a " + url);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            starChrome();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        wait = new WebDriverWait(driver, 20);
        return wait;
    }





}
