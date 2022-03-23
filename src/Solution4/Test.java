package Solution4;

public class Test {
    public static void main(String[] args){
//        System.out.println(Deck.newDeckWithJoker());
        System.out.println(Deck.newDeckWithoutJoker());
        System.out.println(Deck.randomCard());
        Deck.shuffleDeck();
        Deck.displayDeck();
        Deck.sortDeck();
        Deck.displayDeck();
        System.out.println(Deck.getCard(5));
        Deck.displayDeck();
        Deck.setCard(5);
        Deck.setCard(5);
        Deck.displayDeck();
    }
}
