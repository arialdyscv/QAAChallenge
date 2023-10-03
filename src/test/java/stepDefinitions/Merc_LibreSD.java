package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.Merc_LibrePO;
import utils.DriverUtils;


public class Merc_LibreSD {

    @And("I navigate to Mercado Libre")
    public void goTo(){
        DriverUtils.goTo("https://mercadolibre.com/");
    }

    @And("Select country")
    public void clickCountry(){
        Merc_LibrePO mercObj = new Merc_LibrePO();
        mercObj.Select_Country();
    }

    @And("Move to Categories")
    public void hoverCategories(){
        Merc_LibrePO categories = new Merc_LibrePO();
        categories.HoverCategories();

    }

    @And("Total results")
    public void categoryResults(){
        Merc_LibrePO results = new Merc_LibrePO();
        results.GetTotalResultsAfterLocationFilter();
    }

    //BELLEZA Y CUIDADO PERSONAL - PERFUMES

    @And("Select Category Perfumes")
    public void selectCategoryPerfumes(){
        Merc_LibrePO category = new Merc_LibrePO();
        category.SelectCategory("Belleza y Cuidado Personal");
    }

    @And("Click Subcategory Perfumes")
    public void ClickPerfumes(){
        Merc_LibrePO subCatg = new Merc_LibrePO();
        subCatg.ClickSubCategoryPerfumes();
    }

    @Then("Select Perfume Item")
    public void SelectPerfumeItem(){
        Merc_LibrePO selItem = new Merc_LibrePO();
        selItem.SelectPerfumeItem();
    }

    //INDUSTRIAS Y OFICINAS - TEXTILES

    @And("Select Category Industrias")
    public void selectCategoryIndustrias(){
        Merc_LibrePO category = new Merc_LibrePO();
        category.SelectCategory("Industrias y Oficinas");
    }

    @And("Click Subcategory Textiles")
    public void ClickTextiles(){
        Merc_LibrePO subCatg = new Merc_LibrePO();
        subCatg.ClickSubCategoryTextiles();
    }

    @And("Select Textiles Item")
    public void SelectTextilesItem(){
        Merc_LibrePO selItem = new Merc_LibrePO();
        selItem.SelectTextilItem();
    }

    //JUEGOS Y JUGUETES - 0 A 24 MESES

    @And("Select Category Juegos")
    public void selectCategoryJuegos(){
        Merc_LibrePO category = new Merc_LibrePO();
        category.SelectCategory("Juegos y Juguetes");
    }

    @And("Click Subcategory Juguetes")
    public void ClickJuguetes(){
        Merc_LibrePO subCatg = new Merc_LibrePO();
        subCatg.ClickSubCategoryJuguetes();
    }

    @And("Select Juguete Item")
    public void SelectJugueteItem(){
        Merc_LibrePO selItem = new Merc_LibrePO();
        selItem.SelectJugueteItem();
    }

    //TECNOLOGIA - CELULARES Y SMARTPHONES

    @And("Hover Category Tecnologia")
    public void selectCategoryTecnologia(){
        Merc_LibrePO category = new Merc_LibrePO();
        category.SelectCategory("Tecnología");
    }

    @And("Select Subcategory Celulares")
    public void ClickCelulares(){
        Merc_LibrePO subCatg = new Merc_LibrePO();
        subCatg.ClickSubCategoryCelular();
    }

    @And("Select Celular Category")
    public void CelularCategory(){
        Merc_LibrePO celCateg = new Merc_LibrePO();
        celCateg.SelectCelularCategory();
    }

    @And("Select Celular Item")
    public void SelectCelItem(){
        Merc_LibrePO selItem = new Merc_LibrePO();
        selItem.SelectCelularItem();
    }


    @And("Filter by Location")
    public void LocationFilter(){
        Merc_LibrePO locFilt = new Merc_LibrePO();
        locFilt.locationFilter();
    }



}
