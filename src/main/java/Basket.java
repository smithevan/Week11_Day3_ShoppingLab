import java.util.ArrayList;

public class Basket {


    String customerName;
    Boolean loyalty;
    ArrayList<Item> items;




    public Basket(String customerName, Boolean loyalty){
        this.customerName = customerName;
        this.loyalty = loyalty;
        this.items = new ArrayList<Item>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public Boolean getLoyalty() {
        return loyalty;
    }


    public int countItems() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item1) {
        items.remove(item1);
    }

    public void clearBasket() {
        items.clear();
    }

    public double getTotal() {
        int runningTotal = 0;
        for (int i = 0; i < items.size(); i++){
            runningTotal += items.get(i).getPrice();
        }
        return runningTotal;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
