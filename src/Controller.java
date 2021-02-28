import java.util.List;

public class Controller {
    private final Deck deck;
    private final Dealer dealer;
    private final List<Player> players;
    private final View view;

    public Controller(Deck deck, Dealer dealer, List<Player> players, View view) {
        this.deck = deck;
        this.dealer = dealer;
        this.players = players;
        this.view = view;
    }

    public void shuffle(){
        dealer.holdDeck(deck);
        dealer.shuffleDeck();
    }

    public void dealCards(){
        dealer.dealTo(players);
    }

    public void gatherCards(){
        dealer.gather(players);
    }

    public void printDeck(){
        view.printDealerDeck(dealer);
    }

    public void printHands(){
        view.printPlayerHands(players);
    }


}
