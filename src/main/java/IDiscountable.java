import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public interface IDiscountable {

    double discount(ArrayList<Item> items, double total);

}
