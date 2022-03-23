package Solution4;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private String rank;
    private String suit;

    static String[] rankName = {"deuce", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "jack", "queen", "king", "ace"};
    static String[] suitName = {"clubs", "diamonds", "spades", "hearts"};

    public Card(){
        suit = suitName[2];
        rank = rankName[2];
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
    public int hashCode(){
        return Objects.hash(suit, rank);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return  true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Card card = (Card) obj;
        return Objects.equals(suit, card.suit) && Objects.equals(rank, card.rank);
    }

    @Override
    public String toString(){
        return getRank() + " of " + getSuit();
    }

    public String checkDeckMembership(Card card) {
        if (card.suit.equals(suit)) {
            return "The card belongs to the deck";
        } else {
            return "The card does not belong to the deck";
        }
    }

    public String checkRank(Card card) {
        if (card.suit.equals(suit) && rank.compareTo(card.rank) > 0) {
            return "The rank of this card is higher";
        } else if (card.suit.equals(suit) && rank.compareTo(card.rank) < 0) {
            return "The rank of this card is lower";
        } else if (card.suit.equals(suit)){
            return "Card ranks are the same";
        } else {
            return "Cards do not match";
        }
    }

    public int compareTo(Card card) {
        int suitCompare = suit.compareTo(card.suit);

        return (suitCompare != 0 ? suitCompare : rank.compareTo(card.rank));
    }

    public static int compareCards(Card firstCard, Card secondCard){
        int cardPairCompare = firstCard.getSuit().compareTo(secondCard.getSuit());

        return Integer.compare(cardPairCompare, 0);
    }
}
