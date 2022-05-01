package Solution3;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Card implements Comparable<Card> {
    private String rank;
    private String suit;

    private static final List<String> rankNames = new ArrayList<>();
    private static final List<String> suitNames = new ArrayList<>();

    static {
        rankNames.add("deus");
        rankNames.add("three");
        rankNames.add("four");
        rankNames.add("five");
        rankNames.add("six");
        rankNames.add("seven");
        rankNames.add("eight");
        rankNames.add("nine");
        rankNames.add("ten");
        rankNames.add("jack");
        rankNames.add("queen");
        rankNames.add("king");
        rankNames.add("ace");

        suitNames.add("clubs");
        suitNames.add("diamonds");
        suitNames.add("spades");
        suitNames.add("hearts");
    }

    public Card(){
        suit = "spades";
        rank = "four";
    }

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank() { return rank; }

    public String getSuit() { return suit; }

    public void setRank(String newRank) { rank = newRank; }

    public void setSuit(String newSuit) { suit = newSuit; }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return  true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Card  card = (Card) obj;
        return Objects.equals(suit, card.suit) && Objects.equals(rank, card.rank);
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }

    public boolean checkDeckMembership() {
        return suitNames.contains(getSuit()) && rankNames.contains(getRank());
    }

    public String checkRank(Card card) {
        int currentRankIndex = rankNames.indexOf(rank);
        int cardRankIndex = rankNames.indexOf(card.rank);

        if (card.suit.equals(suit) && currentRankIndex > cardRankIndex) {
            return "The rank of this card is higher";
        } else if (card.suit.equals(suit) && currentRankIndex < cardRankIndex) {
            return "The rank of this card is lower";
        } else if (card.suit.equals(suit)) {
            return "Card ranks are the same";
        } else {
            return "Different card suits";
        }
    }

    @Override
    public int compareTo(Card card) {
        int suitCompare = Integer.compare(suitNames.indexOf(suit), suitNames.indexOf(card.suit));

        return (suitCompare != 0 ? suitCompare: Integer.compare(rankNames.indexOf(rank), rankNames.indexOf(card.rank)));
    }

    public static int compareCards(Card firstCard, Card secondCard) {
        int firstCardSuitIndex = suitNames.indexOf(firstCard.suit);
        int secondCardSuitIndex = suitNames.indexOf(secondCard.suit);

        return Integer.compare(firstCardSuitIndex, secondCardSuitIndex);
    }
}