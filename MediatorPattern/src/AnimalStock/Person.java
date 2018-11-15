package AnimalStock;

public class Person {
    private Mediator mediator;
    private String personDetails;

    Person(Mediator mediator, String personDetails){
        this.personDetails = personDetails;
        this.mediator = mediator;
    }

    public void sellAnimal(String animalName, int price){
        mediator.sellOffers(animalName, price, personDetails);
    }

    public  void buyAnimal(String animalName, int price){
        mediator.buyOffers(animalName, price, personDetails);
    }
}
