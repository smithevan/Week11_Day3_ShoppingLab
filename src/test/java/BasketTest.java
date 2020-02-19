import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {


    Basket basket;
    Item item1;

    @Before
    public void before() {
        basket = new Basket("Bob", true);
        item1 = new Item("Kettle", 20.00);
    }

    @Test
    public void testBasketHasCustomerName(){
        assertEquals("Bob", basket.getCustomerName());
    }

    @Test
    public void testBasketStartsEmpty(){
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCustomerHasLoyalty(){
        assertEquals(true, basket.getLoyalty());
    }

    @Test
    public void testCanAddItemToBasket(){
        basket.addItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void testCanRemoveItemFromBasket(){
        basket.addItem(item1);
        basket.removeItem(item1);
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCanClearItemsfromBasket(){
        basket.addItem(item1);
        basket.addItem(item1);
        basket.clearBasket();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void testCanCalculateTotalValueOfBasket(){
        basket.addItem(item1);
        basket.addItem(item1);
        assertEquals(40.00, basket.getTotal(), 0.1);
    }

    @Test
    public void testCanReturnBasketItemsObject(){
        basket.addItem(item1);
        basket.addItem(item1);
        assertEquals(2, basket.getItems().size());
    }



}
