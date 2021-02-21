import java.util.List;
import java.util.Random;

public class Dealer {

    private Deck deck;

    public Deck getDeck() {
        return deck;
    }

    public void holdDeck(Deck deck){
        this.deck = deck;
    }

    public void shuffleDeck() {
        Random random = new Random();

        List<Card> cards = deck.getCards();

        for (int i = cards.size()-1; i >= 0; i--) {
            Card substitute = cards.get(i);
            int index = random.nextInt(i + 1);
            cards.set(i, cards.get(index));
            cards.set(index, substitute);
        }
    }

    public void dealTo(List<Player> players) {

        int remainingCards = deck.getCards().size();

        while (true) {
            for (Player player : players) {
                Card card = deck.removeTopCard();
                player.drawCard(card);
                remainingCards--;
                if (remainingCards == 0) {
                    return;
                }
            }
        }
    }

    public void gather(List<Player> players){
        for(Player player : players){
            deck.addCards(player.getHand());
            player.clearHand();
        }
    }
}
