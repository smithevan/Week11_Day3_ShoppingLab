import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TenPercentOffTest {

    Item item1;
    Basket basket;
    TenPercentOff tenPercentOff;


    @Before
    public void before() {
        basket = new Basket("Bob", true );
        item1 = new Item("Kettle", 20.00);
        tenPercentOff = new TenPercentOff(20.0);
    }

    @Test
    public void testTenPercentOff() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        double total = basket.getTotal();
        double discountedTotal = tenPercentOff.discount(basket.getItems(), total);
        assertEquals(64.00, discountedTotal, 0.01);
    }

}
