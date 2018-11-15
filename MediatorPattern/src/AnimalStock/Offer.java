package AnimalStock;

public class Offer {
    private String personDetails;
    private String animalName;
    private int price;

    Offer(String animalName , int price, String personDetails){
        this.personDetails = personDetails;
        this.animalName = animalName;
        this.price = price;
    }

    public String getPersonDetails() {
        return personDetails;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getPrice() {
        return price;
    }
}
