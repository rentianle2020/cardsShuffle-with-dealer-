import java.util.List;

public class CardController {

    private Deck deck;
    private Dealer dealer;
    private List<Player> players;
    private CardView view;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public CardView getView() {
        return view;
    }

    public void setView(CardView view) {
        this.view = view;
    }

    public CardController(Deck deck, Dealer dealer, List<Player> players, CardView view) {
        this.deck = deck;
        this.dealer = dealer;
        this.players = players;
        this.view = view;
    }

    public void shuffle(){
        dealer.shuffle(deck);
        CardView.shuffleResult();
    }

    public void deal(){
        dealer.deal(deck,players);
        CardView.dealResult();
    }

    public void gather(){
        dealer.gather(deck,players);
        CardView.gatherResult();
    }

    public void printOptions(){
        CardView.printOptions();
    }

    public void printDeck(){
        CardView.printDeck(deck);
    }

    public void printHand(){
        for(Player player:players){
            CardView.printHand(player);
        }
    }
}
