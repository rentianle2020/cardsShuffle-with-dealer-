import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Deck deck = Deck.buildStandard();

        Dealer dealer = new Dealer();

        Player player1 = new Player("张三");
        Player player2 = new Player("李四");
        Player player3 = new Player("王五");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        View view = new View();

        Controller controller = new Controller(deck,dealer,players,view);

        controller.shuffle();

        controller.printDeck();
        controller.printHands();

        controller.dealCards();

        controller.printDeck();
        controller.printHands();

        controller.gatherCards();

        controller.printDeck();
        controller.printHands();

    }
}
