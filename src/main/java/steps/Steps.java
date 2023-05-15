package steps;

import page.BasketPage;
import page.DrinkSpritePage;
import page.PizzaMargaritaPage;

public class Steps {
    private PizzaMargaritaPage pizzaMargaritaPage;
    private DrinkSpritePage drinkSpritePage;
    private BasketPage basketPage;

    public Steps addPizzaMargaritaToBasket() {
        pizzaMargaritaPage = new PizzaMargaritaPage();
        pizzaMargaritaPage.clickPizzaChoiceLink()
                .clickPizzaMargaritaButton()
                .clickPizzaMargaritaChoiceDough()
                .clickPizzaMargaritaChoiceSize()
                .clickPizzaMargaritaOrderButton();

        return this;
    }

    public Steps addDrinkSpriteToBasket() {
        drinkSpritePage = new DrinkSpritePage();
        drinkSpritePage.clickDrinkChoiceLink()
                .clickDrinkSpriteButton();

        return this;
    }

    public Steps checkBasket() {
        basketPage = new BasketPage();
        basketPage.clickBasketLink();
        return this;
    }
}
