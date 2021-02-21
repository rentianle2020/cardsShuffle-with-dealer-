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

    public void buildStandard(){
        char[] suits = {'S', 'H', 'D', 'C'};
        char[] ranks = {'A', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(new Card(suits[j], ranks[i]));
            }
        }
        cards.add(new Card('B', 'J'));
        cards.add(new Card('L', 'J'));
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
        return "本副牌（顺序排列）：" + cards;
    }
}
