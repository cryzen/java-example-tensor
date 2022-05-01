package Solution2VarC;

public class Test {
    public static void main(String[] args){
        Card card = new Card("diamonds", 4);
        Card card1 = new Card("diamonds", 2);

        card.displayCard();
        card1.displayCard();

        System.out.println("Максимальный ранг для масти diamonds " + card1.getMaxRank());

        Card card2 = new Card("diamonds");

        card2.displayCard();

        Card card3 = new Card("heart", 5);
        Card card4 = new Card("heart", 3);

        card3.displayCard();
        card4.displayCard();

        System.out.println("Максимальный ранг для масти heart " + card4.getMaxRank());

        Card card5 = new Card("heart");

        card5.displayCard();

    }
}
