import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaTempoPage {
    public final String EXPECTED_RESULT_ORDER_PIZZA = "Пицца \"Маргарита\" (26см)";
    public final String EXPECTED_RESULT_ORDER_DRINK = "Спрайт 1л";
    public final String ACTUAL_RESULT_ORDER_PIZZA = "//div[@id='basket_expand']//tr[1]//div[@class = 'cart-product-name title']";
    public String ACTUAL_RESULT_ORDER_DRINK = "//div[@id='basket_expand']//tr[2]//div[@class = 'cart-product-name title']";
    public final String URL = "https://www.pizzatempo.by/";
    private final String xPathPizzaChoiceLink = "//a[@href = 'https://www.pizzatempo.by/menu/pizza.html']";
    private final String xPathPizzaMargaritaButton ="//span[contains(text(), 'Маргарита')]/ancestor::div[contains(@class,'item')]//button";
    private final String xPathPizzaMargaritaChoiceDough = "//h3[contains(text(), 'Маргарита')]/ancestor::div[@class='popupContent']//div[contains(text(),'Тонкое тесто')]";
    private final String xPathPizzaMargaritaChoiceSize = "//h3[contains(text(), 'Маргарита')]/ancestor::div[@class='popupContent']//div[contains(text(),'26')]";
    private final String xPathPizzaMargaritaOrderButton = "//div[@id='order_pizza_popup']//div[@class='order-btn']";
    private final String xPathPizzaBasketLink = "//div[@class = 'basket-top']//a[@href='https://www.pizzatempo.by/menu/order/']";

    private String xPathDrinkChoiceLink = "//a[@href='https://www.pizzatempo.by/menu/napitki.html']";
    private String xPathDrinkSpriteButton = "//span[contains(text(), 'Спрайт')]/ancestor::div[contains(@class, 'item')]//button";
    WebDriver driver;
    public PizzaTempoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openPizzaTempoPage(){
        driver.navigate().to(URL);
    }
    public PizzaTempoPage clickPizzaChoiceLink(){
        By byPizzaChoiceRLink = By.xpath(xPathPizzaChoiceLink);
        WebElement webElementPizzaChoiceLink = driver.findElement(byPizzaChoiceRLink);
        webElementPizzaChoiceLink.click();
        return this;
    }
    public void clickPizzaMargaritaButton(){

        WebElement webElementPizzaMargaritaButton = driver.findElement(By.xpath(xPathPizzaMargaritaButton));
        webElementPizzaMargaritaButton.click();
    }
     public PizzaTempoPage clickPizzaMargaritaChoiceDough() {
        WebElement webElementPizzaMargaritaChoiceDough = driver.findElement(By.xpath(xPathPizzaMargaritaChoiceDough));
        webElementPizzaMargaritaChoiceDough.click();
        return this;
     }
     public PizzaTempoPage clickPizzaMargaritaChoiceSize(){
        WebElement webElementPizzaMargaritaChoiceSize = driver.findElement(By.xpath(xPathPizzaMargaritaChoiceSize));
        webElementPizzaMargaritaChoiceSize.click();
        return this;
     }
     public PizzaTempoPage clickPizzaMargaritaOrderButton(){
        WebElement webElementPizzaMargaritaOrderButton = driver.findElement(By.xpath(xPathPizzaMargaritaOrderButton));
        webElementPizzaMargaritaOrderButton.click();
        return this;
     }
     public PizzaTempoPage clickPizzaBasketLink(){
        WebElement webElementPizzaBasketLink = driver.findElement(By.xpath(xPathPizzaBasketLink));
        webElementPizzaBasketLink.click();
        return this;
     }
     public String getPizzaOrderText(){
        WebElement webElementPizzaOrderText = driver.findElement(By.xpath(ACTUAL_RESULT_ORDER_PIZZA));
        String actualPizzaOrderText = webElementPizzaOrderText.getText();
        return actualPizzaOrderText;
     }
     public PizzaTempoPage clickDrinkChoiceLink(){
        WebElement webElementDrinkChoiceLink = driver.findElement(By.xpath(xPathDrinkChoiceLink));
        webElementDrinkChoiceLink.click();
        return this;
     }
     public PizzaTempoPage clickDrinkSpriteButton(){
        WebElement webElementDrinkSpriteButton = driver.findElement(By.xpath(xPathDrinkSpriteButton));
        webElementDrinkSpriteButton.click();
        return this;
     }
     public String getDrinkOrderText(){
        WebElement webElementDrinkOrderText = driver.findElement(By.xpath(ACTUAL_RESULT_ORDER_DRINK));
        String actualDrinkOrderText = webElementDrinkOrderText.getText();
        return actualDrinkOrderText;
     }
}
