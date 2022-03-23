package Solution2VarC;

public class Test {
    public static void main(String[] args){
        Card card = new Card("diamonds", 2);
        Card card1 = new Card("diamonds", 4);

        card.displayCard();
        card1.displayCard();

        System.out.println(Card.getMaxRank());

        Card card2 = new Card("diamonds");

        card2.displayCard();

    }
}
