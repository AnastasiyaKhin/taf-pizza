import page.BasePage;
import page.BasketPage;
import steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTempoTest extends BaseTest {
    BasketPage basketPage = new BasketPage();

    @Test
    void testOrderPizzaMargarita() {
        Steps steps = new Steps();
        steps.addPizzaMargaritaToBasket();
        steps.addDrinkSpriteToBasket();
        steps.checkBasket();

        Assertions.assertEquals(basketPage.EXPECTED_RESULT_ORDER_PIZZA, basketPage.getPizzaOrderText());
        Assertions.assertEquals(basketPage.EXPECTED_RESULT_ORDER_DRINK, basketPage.getDrinkOrderText());
    }
}
