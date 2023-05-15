import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.BasePage;

public class BaseTest {
    WebDriver driver;

    BasePage basePage = new BasePage();

    @BeforeEach
    public void setup() {
        basePage.openPizzaTempoPage();
    }

    @AfterEach
    public void closeWebDiver() {
        Driver.closeDriver();
    }
}
