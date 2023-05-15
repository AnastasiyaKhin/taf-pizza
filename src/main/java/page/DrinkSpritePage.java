package page;

import org.openqa.selenium.By;

public class DrinkSpritePage extends BasePage {

    private By drinkChoiceLink = By.xpath("//a[@href='https://www.pizzatempo.by/menu/napitki.html']");
    private By drinkSpriteButton = By.xpath("//span[contains(text(), 'Спрайт')]/ancestor::div[contains(@class, 'item')]//button");

    public DrinkSpritePage() {
        super();
    }

    public DrinkSpritePage clickDrinkChoiceLink() {
        clickOnElement(drinkChoiceLink);
        return this;
    }

    public DrinkSpritePage clickDrinkSpriteButton() {
        clickOnElement(drinkSpriteButton);
        return this;
    }
}
