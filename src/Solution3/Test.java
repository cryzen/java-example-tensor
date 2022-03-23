package Solution3;

public class Test {
    public static void main(String[] args){
        Card card1 = new Card();

        System.out.println(card1.toString());
        System.out.println(card1.hashCode());

        Card card2 = new Card("spades", "four");

        System.out.println(card2.toString());
        System.out.println(card2.hashCode());

        System.out.println();

        System.out.println(card1.equals(card2));
        System.out.println(card1.checkRank(card2));
        System.out.println(card2.compareTo(card1));

        System.out.println();

        System.out.println(Card.compareCards(card1, card2));
    }
}
