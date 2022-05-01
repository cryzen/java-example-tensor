package Solution4;

import java.util.*;

public class Deck {
    private final List<Card> prototypeDeck = new ArrayList<>(52);
    private Card removingCard;

    public Deck() {}

    public List<Card> newDeckWithoutJoker() {
        for (String suit: Card.suitNames){
            for (String rank: Card.rankNames){
                prototypeDeck.add(new Card(suit, rank));
            }
        }

        return prototypeDeck;
    }

    public List<Card> newDeckWithJoker(){
        for (String suit: Card.suitNames){
            for (String rank: Card.rankNames){
                prototypeDeck.add(new Card(suit, rank));
            }
        }

        prototypeDeck.add(new Card("diamonds", "joker"));
        prototypeDeck.add(new Card("clubs", "joker"));

        return prototypeDeck;
    }

    public Card randomCard() {
        Random rand = new Random();
        return prototypeDeck.get(rand.nextInt(prototypeDeck.size()));
    }

    public void displayDeck() {
        System.out.println(prototypeDeck);
    }

    public void shuffleDeck() {
        Collections.shuffle(prototypeDeck);
    }

    public void sortDeck() {
        Collections.sort(prototypeDeck);
    }

    public Card getCard(int cardIndex) {
        Card nameCard = prototypeDeck.get(cardIndex);
        removingCard = nameCard;
        prototypeDeck.remove(cardIndex);
        return nameCard;
    }

    public void setCard(int cardIndex){
        if (prototypeDeck.contains(removingCard)) {
            System.out.println("This card is already in the deck");
        } else {
            prototypeDeck.add(cardIndex, removingCard);
        }
    }

    public boolean checkDeck() {
        return prototypeDeck.isEmpty();
    }
}