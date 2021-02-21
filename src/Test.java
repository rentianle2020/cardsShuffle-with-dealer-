import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.buildStandard();

        Dealer dealer = new Dealer();
        dealer.holdDeck(deck);

        Player player1 = new Player("张三");
        Player player2 = new Player("李四");
        Player player3 = new Player("王五");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        dealer.shuffleDeck();
        System.out.println(deck);
        dealer.dealTo(players);

        for (Player player : players){
            System.out.println(player);
        }

        dealer.gather(players);
        System.out.println(dealer.getDeck());
        for (Player player : players){
            System.out.println(player);
        }
    }
}
