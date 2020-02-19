import java.util.ArrayList;

public class BuyOneGetOneFree implements IDiscountable{

    public BuyOneGetOneFree(){
        super();
    }

    public double discount(ArrayList items, double total){
        return total / 2.0;
    }

}
