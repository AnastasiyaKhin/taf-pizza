package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage{
    private final By basketLink = By.xpath("//div[@class = 'basket-top']//a[@href='https://www.pizzatempo.by/menu/order/']");
    public final String EXPECTED_RESULT_ORDER_PIZZA = "Пицца \"Маргарита\" (26см)";
    public final By ACTUAL_RESULT_ORDER_PIZZA = By.xpath("//div[@id='basket_expand']//tr[1]//div[@class = 'cart-product-name title']");

    public final String EXPECTED_RESULT_ORDER_DRINK = "Спрайт 1л";
    public final By ACTUAL_RESULT_ORDER_DRINK = By.xpath("//div[@id='basket_expand']//tr[2]//div[@class = 'cart-product-name title']");
    public BasketPage(){
        super();
    }
    public BasketPage clickBasketLink() {
        clickOnElement(basketLink);
        return this;
    }
    public String getPizzaOrderText() {
       return getText(ACTUAL_RESULT_ORDER_PIZZA);
    }

    public String getDrinkOrderText(){
        return  getText(ACTUAL_RESULT_ORDER_DRINK);
    }
}
