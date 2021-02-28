import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {

    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public static Deck buildStandard(){
        List<Card> cards = new ArrayList<>();

        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }
        cards.add(new Card(Joker.BIG_JOKER));
        cards.add(new Card(Joker.SMALL_JOKER));

        return new Deck(cards);
    }

    public Card removeTopCard(){
        return cards.remove(cards.size()-1);
    }

    public void addCards(List<Card> cards){
        for(Card card : cards){
            getCards().add(card);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(cards);
    }
}
