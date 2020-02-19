import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BuyOneGetOneFreeTest {

    Item item1;
    Basket basket;
    BuyOneGetOneFree buyOneGetOneFree;


    @Before
    public void before() {
        basket = new Basket("Bob", true);
        item1 = new Item("Kettle", 20.00);
        buyOneGetOneFree = new BuyOneGetOneFree();
    }

    @Test
    public void testBuyOneGetOneFree() {
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        basket.addItem(item1);
        double total = basket.getTotal();
        double discountedTotal = buyOneGetOneFree.discount(basket.getItems(), total);
        assertEquals(40.00, discountedTotal, 0.01);
    }




}
