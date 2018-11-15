public class Main {
    public static void main(String[] args) {
        Rent rent1 = new Rent(10, 2);
        Rent rent2 = new Rent(20, 3);
        Rent rent3 = new Rent(10, 3);
        Rent rent4 = new Rent(10, 3);
        rent1.returnBicycle();
        Rent rent5 = new Rent(10, 3);
        rent4.returnBicycle();
        Rent rent6 = new Rent(10, 3);
        Storage.getInstance().getAllBicycles();
    }
}
