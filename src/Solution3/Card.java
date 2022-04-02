package Solution3;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Card{
    private String rank;
    private String suit;

    private static final List<String> rankName = new ArrayList<>();
    private static final List<String> suitName = new ArrayList<>();

    static {
        rankName.add("deus");
        rankName.add("three");
        rankName.add("four");
        rankName.add("five");
        rankName.add("six");
        rankName.add("seven");
        rankName.add("eight");
        rankName.add("nine");
        rankName.add("ten");
        rankName.add("jack");
        rankName.add("queen");
        rankName.add("king");
        rankName.add("ace");

        suitName.add("clubs");
        suitName.add("diamonds");
        suitName.add("spades");
        suitName.add("hearts");
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
        return suitName.contains(getSuit()) && rankName.contains(getRank());
    }

    public String checkRank(Card card) {
        int currentRankIndex = rankName.indexOf(rank);
        int cardRankIndex = rankName.indexOf(card.rank);

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

    public int compareTo(Card card) {
        int suitCompare = Integer.compare(suitName.indexOf(suit), suitName.indexOf(card.suit));

        return (suitCompare != 0 ? suitCompare: Integer.compare(rankName.indexOf(rank), rankName.indexOf(card.rank)));
    }

    public static int compareCards(Card firstCard, Card secondCard) {
        int firstCardSuitIndex = suitName.indexOf(firstCard.suit);
        int secondCardSuitIndex = suitName.indexOf(secondCard.suit);

        return Integer.compare(firstCardSuitIndex, secondCardSuitIndex);
    }
}