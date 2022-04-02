package Solution3;

public class Test {
    public static void main(String[] args){
        Card card1 = new Card();

        Card card3 = new Card("square", "sixteen");

        System.out.println(card1.getRank());
        System.out.println(card1.hashCode());

        Card card2 = new Card("spades", "three");
        Card card4 = new Card("spades", "three");

        System.out.println(card2);
        System.out.println(card2.hashCode());

        System.out.println();

        System.out.println(card3.checkDeckMembership());
        System.out.println(card4.equals(card2));
        System.out.println(card4.checkRank(card2));
        System.out.println(card4.compareTo(card2));

        System.out.println();

        System.out.println(Card.compareCards(card4, card2));
    }
}
