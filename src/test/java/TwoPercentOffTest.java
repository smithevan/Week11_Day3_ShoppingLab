import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TwoPercentOffTest {

    Item item1;
    Basket basket;
    Basket basket2;
    TwoPercentOff twoPercentOff;


    @Before
    public void before() {
        basket = new Basket("Bob", true );
        basket2 = new Basket("Bob", false );
        item1 = new Item("Kettle", 20.00);
        twoPercentOff = new TwoPercentOff(2.0);
    }

    @Test
    public void testTwoPercentOff() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        double total = basket.getTotal();
        double discountedTotal = twoPercentOff.discount(basket.getItems(), total, basket.getLoyalty());
        assertEquals(78.40, discountedTotal, 0.01);
    }

    @Test
    public void testTwoPercentOffIfFalse() {
        basket2.addItem(item1);
        basket2.addItem(item1);
        basket2.addItem(item1);
        basket2.addItem(item1);
        double total = basket2.getTotal();
        double discountedTotal = twoPercentOff.discount(basket2.getItems(), total, basket2.getLoyalty());
        assertEquals(80.00, discountedTotal, 0.01);
    }


}
