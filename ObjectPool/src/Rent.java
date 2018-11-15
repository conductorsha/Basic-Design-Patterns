public class Rent {
    private Bicycle bicycle;
    private int days;
    Rent(int price, int days){
        bicycle = Storage.getInstance().rentBicycle(price);
        this.days = days;
    }

    private int getDates(){
        return days;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void returnBicycle(){
        Storage.getInstance().returnBicycle(bicycle);
        bicycle = null;
    }
}
