package AnimalStock;

public interface Mediator {
    //interface for implementing basic Stock functions
    void sellOffers(String animal, int price, String personDetails );
    void buyOffers(String animal, int price, String personDetails);
}
