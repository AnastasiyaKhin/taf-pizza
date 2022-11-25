package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    private static final String URL = "https://www.pizzatempo.by/";

    public BasePage() {
        this.driver = Driver.getInstance();
    }

    public void openPizzaTempoPage() {
        driver.navigate().to(URL);
    }

    protected void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    protected String getText(By locator) {
        String actualResult = driver.findElement(locator).getText();
        return actualResult;
    }
}
