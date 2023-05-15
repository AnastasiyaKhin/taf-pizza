package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static constant.Constant.IMPLICIT_WAIT;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage()
                    .window()
                    .maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
