package AnimalStock;

public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Person person = new Person(stock, "Taras Buch");
        Person person2 = new Person(stock, "Sonya blade");
        person.sellAnimal("lisica", 500);
        person2.sellAnimal("medved'", 1000);

        person.buyAnimal("medved'", 1100);
        person2.buyAnimal("lisica", 300);
        stock.showOffers();
    }

}
