package AnimalStock;

import java.util.ArrayList;

public class Stock  implements Mediator{
    private ArrayList<Person> people;
    private ArrayList<Offer> animalForSell;
    private ArrayList<Offer> animalRequests;

    Stock(){
        people = new ArrayList<>();
        animalRequests = new ArrayList<>();
        animalForSell = new ArrayList<>();
    }

    //for Sellers. Sells an animal if it's required on the stock with equal or bigger Price
    @Override
    public void sellOffers(String animal, int price, String personDetails) {

        boolean isSomebodyWantsToBuy = false;
        for(Offer offer: animalRequests){
            if(offer.getAnimalName().equals(animal) && offer.getPrice()>=price){
                System.out.println(personDetails + " wanted to Sell: " + animal + " . DesiredPrice: " + price + " . Was sold for: " + offer.getPrice());
                isSomebodyWantsToBuy = true;
                animalRequests.remove(offer);
                break;
            }
        }
        if(!isSomebodyWantsToBuy){
            System.out.println(personDetails + "wants to Sell: " + animal + " for " + price + ". Added to the WantToSell");
            Offer newSellOffer = new Offer(animal, price, personDetails);
            animalForSell.add(newSellOffer);
        }
    }
//for Buyers.  Buys an animal if it's available on the Stock with equal or lower price
    @Override
    public void buyOffers(String animal, int price, String personDetails) {
        boolean isSomebodySell = false;
        for(Offer offer: animalForSell){
            if(offer.getAnimalName().equals(animal) && offer.getPrice() <= price){
                System.out.println(personDetails + " wanted to buy: " + animal + " for the price: " + price  + " . Final price: " + offer.getPrice());
                isSomebodySell = true;
                animalForSell.remove(offer);
                break;
            }
        }
        if(!isSomebodySell){
            System.out.println(personDetails + " wants to buy: " + animal + "for the price " + price + ". Added to the WantToBuy");
            Offer newOfferForSell = new Offer(animal, price, personDetails);
            animalRequests.add(newOfferForSell);
        }
    }

    public void showOffers(){
        for(Offer offer : animalForSell ) System.out.println(offer.getPersonDetails() + " sells " + offer.getAnimalName() + " for " +offer.getPrice());
        for(Offer offer : animalRequests) System.out.println(offer.getPersonDetails() + " wants to buy " + offer.getAnimalName() + " for " + offer.getPrice());
    }
}
