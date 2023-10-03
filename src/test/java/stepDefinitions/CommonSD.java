package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverUtils;

public class CommonSD {

    @Given("I open CHROME")
    public void openChrome(){
        DriverUtils.starChrome();
    }

   @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) DriverUtils.getDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "myscreenshot");
        DriverUtils.closeDriver();
    }
}
