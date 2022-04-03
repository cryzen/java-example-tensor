package Solution2VarC;

public class Card {
    private static int maxRank;

    private int rank;
    private String suit;
    private final int suitMaxRank;

    public Card(){
        suit = "diamonds";
        rank = 4;
        maxRank = rank;
        suitMaxRank = maxRank;
    }

    public Card(String suit, int rank){
        if (rank > maxRank) {
            maxRank = rank;
        }

        this.suit = suit;
        this.rank = rank;
        suitMaxRank = maxRank;
    }

    public Card(String suit) {
        this(suit, ++maxRank);
    }

    void displayCard() {
        System.out.println(rank + " of " + suit);
    }

    public static int getMaxRank() { return maxRank; }

    public int getRank() { return rank; }

    public String getSuit() { return suit; }

    public void setRank(int newRank) { rank = newRank; }

    public void setSuit(String newSuit){
        switch (newSuit) {
            case "diamonds", "clubs", "hearts", "spades" -> suit = newSuit;
            default -> System.out.println("Such a suit does not exist!");
        }
    }
}