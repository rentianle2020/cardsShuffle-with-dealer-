import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        String[] suits = {"S", "H", "D", "C"};
        String[] ranks = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(new Card(suits[j], ranks[i]));
            }
        }

        cards.add(new Card("B", "J"));
        cards.add(new Card("L", "J"));
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return cards + "";
    }
}
