package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.CommonUtils;
import utils.DriverUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Merc_LibrePO {

    private WebDriver driver;
    //private WebDriverWait wait;

    public Merc_LibrePO(){
        driver = DriverUtils.getDriver();
        //wait = DriverUtils.getWait();
    }
// COMMON STEPS
    public void Select_Country(){
        System.out.println("Seleccionando Pais...");
        WebElement country = driver.findElement(By.id("AR"));
        country.click();
    }

    public void HoverCategories(){
        //Hover mouse on Categories
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement categories = driver.findElement(By.xpath("//*[@class='nav-menu-categories-link']"));
        action.moveToElement(categories).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Mover mouse hacia categorias...");
    }

    public void SelectCategory(String categoria){
        WebElement category = driver.findElement(By.xpath("//a[text()='"+categoria+"' ]"));
        Actions action = new Actions(driver);
        action.click(category).perform();
        System.out.println("Seleccionar Categoria");

    }

    public void locationFilter(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement LocFilter = driver.findElement(By.xpath("//a[@aria-label='Capital Federal']"));
        CommonUtils.ScrollDown(driver,"0","1250");
        Actions action = new Actions(driver);
        action.click(LocFilter).perform();
        System.out.println("Filtrar por Ubicacion");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public int GetTotalResultsAfterLocationFilter() {
        WebElement totalResultsElement = driver.findElement(By.xpath("//span[@class='quantity-results']"));
        String totalResultsText = totalResultsElement.getText();
        // Parsea el texto para obtener el total de resultados
        int totalResults = Integer.parseInt(totalResultsText.replaceAll("[^0-9]", ""));
        return totalResults;
    }



    //CATEGORIA PERFUMES
    public void ClickSubCategoryPerfumes(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        CommonUtils.ScrollDown(driver,"0","250");
        WebElement subcategory = driver.findElement(By.xpath("//img[@alt='Perfumes']"));
        Actions action = new Actions(driver);
        action.click(subcategory).perform();
        System.out.println("Seleccionando subCategoria");
    }
    public void SelectPerfumeItem(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement randomItem = driver.findElement(By.xpath("(//div[contains(@class,'ui-search-result__content')])[7]"));
        Actions action = new Actions(driver);
        action.click(randomItem).perform();
        System.out.println("Seleccionar Articulo");
    }

    //CELULARES Y SMARTPHONES
    public void ClickSubCategoryCelular(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subcategory = driver.findElement(By.xpath("//a[normalize-space()='Celulares y Smartphones']"));
        Actions action = new Actions(driver);
        action.moveToElement(subcategory).perform();
        action.click(subcategory).perform();
        System.out.println("Seleccionando subCategoria");
    }

    public void SelectCelularCategory(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement randomItem = driver.findElement(By.xpath("(//div[@class='andes-card__content'])[2]"));
        Actions action = new Actions(driver);
        action.click(randomItem).perform();
        System.out.println("Seleccionar Categoria Celulares");
    }

    public void SelectCelularItem(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement randomItem = driver.findElement(By.xpath("(//div[contains(@aria-label,'1 de 1')]//a[contains(@title,'Samsung Galaxy S22')])[1]"));
        Actions action = new Actions(driver);
        action.click(randomItem).perform();
        System.out.println("Seleccionar Articulo");
    }


    //CATEGORIA TEXTIL
    public void ClickSubCategoryTextiles(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subcategory = driver.findElement(By.xpath("//div[@class='banner']/img[@alt='TEXTIL']"));
        Actions action = new Actions(driver);
        action.click(subcategory).perform();
        System.out.println("Seleccionando subCategoria");
    }
    public void SelectTextilItem(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement randomItem = driver.findElement(By.xpath("(//div[@class='ui-search-item__group ui-search-item__group--title shops__items-group']//a)[2]"));
        Actions action = new Actions(driver);
        action.click(randomItem).perform();
        System.out.println("Seleccionar Articulo");
    }


    //CATEGORIA JUGUETES 0 a 24 MESES
    public void ClickSubCategoryJuguetes(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subcategory = driver.findElement(By.xpath("//a[.='0 A 24 MESES']"));
        Actions action = new Actions(driver);
        action.click(subcategory).perform();
        System.out.println("Seleccionando subCategoria");
    }

    public void SelectJugueteItem(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement randomItem = driver.findElement(By.xpath("(//div[contains(@class,'ui-search-result__content')])[7]"));
        Actions action = new Actions(driver);
        action.click(randomItem).perform();
        System.out.println("Seleccionar Articulo");
    }

}
