import java.util.ArrayList;

public class Storage {
    private ArrayList<Bicycle> availableBicycles;
    private ArrayList<Bicycle> bicyclesInRent;

    private static final Storage storage = new Storage();
//eager Singleton
    private Storage() {
        availableBicycles = new ArrayList<>();
        bicyclesInRent = new ArrayList<>();
        availableBicycles.add(new Bicycle(20, "Ukraina"));
        availableBicycles.add(new Bicycle(20, "Ukraina"));
        availableBicycles.add(new Bicycle(10, "Polska"));
        availableBicycles.add(new Bicycle(10, "Polska"));
        availableBicycles.add(new Bicycle(30, "Tajikistan"));
        availableBicycles.add(new Bicycle(30, "Tajikistan"));
        availableBicycles.add(new Bicycle(50, "Uzbek"));
        availableBicycles.add(new Bicycle(50, "Uzbek"));
    }

    public static Storage getInstance() {
        return storage;
    }

    //if we want to buy a new bicycle
    public void addBicycle(int price) {
        availableBicycles.add(new Bicycle(price, "NewONe"));
        System.out.println("Bicycle was added. Price: " + price);
    }

    public Bicycle rentBicycle(int price) {
        for (Bicycle b : availableBicycles) {
            if (b.getPricePerDay() == price) {
                bicyclesInRent.add(b);
                availableBicycles.remove(b);
                System.out.println("Bicycle " + b.getName() + " have been successfully rented");
                return b;
            }
        }
        Bicycle bicyc = new Bicycle(price, "NewBought");
        bicyclesInRent.add(bicyc);
        System.out.println("No bicycles with price " + price  + " were available. We bought the new one");
        return bicyc;
    }

    public void returnBicycle(Bicycle bicycle){
        bicyclesInRent.remove(bicycle);
        availableBicycles.add(bicycle);
        System.out.println("Bicycle with price " + bicycle.getPricePerDay() + " and name " + bicycle.getName() + " was returned.");
        getAllBicycles();
    }


    public void getAllBicycles() {
        System.out.println("Bicycles available: ");
        availableBicycles.forEach(e -> System.out.println("Bicycle: " +e.getName()+ " "+ e.getPricePerDay() + "pln/day"));
    }
}
