import java.util.ArrayList;

public class Bicycle {
   private int pricePerDay;
   private String name;
    Bicycle(int pricePerDay, String name ){
        this.pricePerDay = pricePerDay;
        this.name = name;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public String getName() {
        return name;
    }
}
