import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PizzaTempoTest extends BaseTest {
    @Test
    void testOrderPizzaMargarita(){

        PizzaTempoPage page = new PizzaTempoPage(driver);

        page.openPizzaTempoPage();
        page.clickPizzaChoiceLink();
        page.clickPizzaMargaritaButton();
        page.clickPizzaMargaritaChoiceDough();
        page.clickPizzaMargaritaChoiceSize();
        page.clickPizzaMargaritaOrderButton();
        page.clickDrinkChoiceLink();
        page.clickDrinkSpriteButton();
        page.clickPizzaBasketLink();

        Assertions.assertEquals(page.EXPECTED_RESULT_ORDER_PIZZA,page.getPizzaOrderText());
        Assertions.assertEquals(page.EXPECTED_RESULT_ORDER_DRINK,page.getDrinkOrderText());
    }
}
