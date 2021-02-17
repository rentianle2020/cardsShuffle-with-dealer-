import java.util.List;
import java.util.Random;

public class Dealer {

    public void shuffle(Deck deck) {

        Random random = new Random();

        List<Card> cards = deck.getCards();

        for (int i = cards.size()-1; i >= 0; i--) {
            Card substitute = cards.get(i);
            int index = random.nextInt(i + 1);
            cards.set(i, cards.get(index));
            cards.set(index, substitute);
        }
    }

    public void deal(Deck deck,List<Player> players) {

        List<Card> cards = deck.getCards();

        int restCards = cards.size();

        while (true) {
            for (Player player : players) {
                player.getHand().add(cards.get(restCards - 1));
                cards.remove(restCards - 1);
                restCards--;
                if (restCards == 0) {
                    return;
                }
            }
        }
    }

    public void gather(Deck deck, List<Player> players){

        for (Player player : players){
            deck.getCards().addAll(player.getHand());
            player.getHand().clear();
        }

    }
}
