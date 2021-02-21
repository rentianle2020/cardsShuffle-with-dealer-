public class Card {

    private final char suit;
    private final char rank;

    public Card(char suit, char rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  "" + suit +rank ;
    }
}
