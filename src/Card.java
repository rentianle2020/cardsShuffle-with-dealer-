public class Card {

    private final String suit;
    private final String rank;

    public Card(Suit suit,Rank rank) {
        this.suit = suit.getAbbr();
        this.rank = rank.getAbbr();
    }

    public Card(Joker joker){
        this.suit = "";
        this.rank = joker.getAbbr();
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
}
