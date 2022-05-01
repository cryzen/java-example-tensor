package Solution4;

public class Test {
    public static void main(String[] args){
        Deck deckWithoutJoker = new Deck();
        deckWithoutJoker.newDeckWithoutJoker();
        deckWithoutJoker.displayDeck();
        System.out.println(deckWithoutJoker.randomCard());
        deckWithoutJoker.shuffleDeck();
        deckWithoutJoker.displayDeck();
        deckWithoutJoker.sortDeck();
        deckWithoutJoker.displayDeck();
        System.out.println(deckWithoutJoker.getCard(2));
        deckWithoutJoker.setCard(3);
        deckWithoutJoker.setCard(2);
        deckWithoutJoker.displayDeck();

        System.out.println();
        System.out.println();
        System.out.println();

        Deck deckWithJoker = new Deck();
        deckWithJoker.newDeckWithJoker();
        deckWithJoker.displayDeck();
        System.out.println(deckWithoutJoker.randomCard());
        deckWithJoker.shuffleDeck();
        deckWithJoker.displayDeck();
        deckWithJoker.sortDeck();
        deckWithJoker.displayDeck();
        System.out.println(deckWithJoker.getCard(2));
        deckWithJoker.setCard(3);
        deckWithJoker.setCard(2);
        deckWithJoker.displayDeck();
    }
}
