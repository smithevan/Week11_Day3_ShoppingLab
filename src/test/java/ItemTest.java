import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("Potato", 2.00) ;
    }

    @Test
    public void testItemHasName(){
        assertEquals("Potato", item.getName());
    }

    @Test
    public void testItemHasPrice(){
        assertEquals(2.00, item.getPrice(), 0.01);
    }


}
