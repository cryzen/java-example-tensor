package Solution2VarB;

public class Card{
    private int rank;
    private String suit;

    public Card(){
        suit = "diamonds";
        rank = 4;
    }

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