package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaMargaritaPage extends BasePage {

    private final By pizzaChoiceLink = By.xpath("//a[@href = 'https://www.pizzatempo.by/menu/pizza.html']");
    private final By pizzaMargaritaButton = By.xpath("//span[contains(text(), 'Маргарита')]/ancestor::div[contains(@class,'item')]//button");
    private final By pizzaMargaritaChoiceDough = By.xpath("//h3[contains(text(), 'Маргарита')]/ancestor::div[@class='popupContent']//div[contains(text(),'Тонкое тесто')]");
    private final By pizzaMargaritaChoiceSize = By.xpath("//h3[contains(text(), 'Маргарита')]/ancestor::div[@class='popupContent']//div[contains(text(),'26')]");
    private final By pizzaMargaritaOrderButton = By.xpath("//div[@id='order_pizza_popup']//div[@class='order-btn']");

    public PizzaMargaritaPage() {
        super();
    }

    public PizzaMargaritaPage clickPizzaChoiceLink() {
        clickOnElement(pizzaChoiceLink);
        return this;
    }

    public PizzaMargaritaPage clickPizzaMargaritaButton() {
        clickOnElement(pizzaMargaritaButton);
        return this;
    }

    public PizzaMargaritaPage clickPizzaMargaritaChoiceDough() {
        clickOnElement(pizzaMargaritaChoiceDough);
        return this;
    }

    public PizzaMargaritaPage clickPizzaMargaritaChoiceSize() {
        clickOnElement(pizzaMargaritaChoiceSize);
        return this;
    }

    public PizzaMargaritaPage clickPizzaMargaritaOrderButton() {
        clickOnElement(pizzaMargaritaOrderButton);
        return this;
    }


}
