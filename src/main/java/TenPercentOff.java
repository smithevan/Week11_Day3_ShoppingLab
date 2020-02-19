import java.util.ArrayList;

public class TenPercentOff implements IDiscountable{

    double percentage;
    double totalDiscount;
    double total;

    public TenPercentOff(double percentage){
        super();
        this.percentage = percentage;
    }

    public double discount(ArrayList items, double total){
        totalDiscount = total * (percentage/100.0);
        return total - totalDiscount;

    }

}
