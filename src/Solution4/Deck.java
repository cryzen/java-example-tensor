package Solution4;

import java.util.*;

public class Deck {
    private static final List<Card> prototypeDeck = new ArrayList<Card>(52);
    private static Card removingCard;

    static {
        for (String suit: Card.suitName){
            for (String rank: Card.rankName){
                prototypeDeck.add(new Card(suit, rank));
            }
        }
    }

    private Deck() {}

    public static List<Card> newDeckWithoutJoker() {
        return new ArrayList<Card>(prototypeDeck);
    }

    public static List<Card> newDeckWithJoker(){
        prototypeDeck.add(new Card("diamonds", "joker"));
        prototypeDeck.add(new Card("clubs", "joker"));
        return prototypeDeck;
    }

    public static Card randomCard() {
        Random rand = new Random();
        return prototypeDeck.get(rand.nextInt(prototypeDeck.size()));
    }

    public static void displayDeck() {
        System.out.println(prototypeDeck);
    }

    public static void shuffleDeck() {
        Collections.shuffle(prototypeDeck);
    }

    public static void sortDeck() {
        Collections.sort(prototypeDeck);
    }

    public static Card getCard(int cardIndex) {
        Card nameCard = prototypeDeck.get(cardIndex);
        removingCard = nameCard;
        prototypeDeck.remove(cardIndex);
        return nameCard;
    }

    public static void setCard(int cardIndex){
        if (prototypeDeck.contains(removingCard)) {
            System.out.println("This card is already in the deck");
        } else {
            prototypeDeck.add(cardIndex, removingCard);
        }
    }

    public static boolean checkDeck() {
        return prototypeDeck.isEmpty();
    }
}