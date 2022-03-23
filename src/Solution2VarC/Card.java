package Solution2VarC;

public class Card {
    private int rank;
    private String suit;
    private static int maxRank;

    public Card(){
        suit = "diamonds";
        rank = 4;
    }

    public Card(String suit, int rank){
        this.suit = suit;
        this.rank = rank;
        maxRank = rank;
    }

    public Card(String suit){
        this(suit, ++maxRank);
    }

    void displayCard(){
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