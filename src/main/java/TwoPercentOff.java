import java.util.ArrayList;

public class TwoPercentOff {

    double percentage;
    double totalDiscount;
    double total;

    public TwoPercentOff(double percentage){
        super();
        this.percentage = percentage;
    }

    public double discount(ArrayList items, double total, boolean loyalty){
        if (loyalty == true) {
            totalDiscount = total * (percentage / 100.0);
            return total - totalDiscount;
        }
        return total;
    }


}
