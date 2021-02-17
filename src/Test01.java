import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Dealer dealer = new Dealer();

        List<Player> players = new ArrayList<>();
        players.add(new Player("张三"));
        players.add(new Player("李四"));
        players.add(new Player("王五"));

        CardView view = new CardView();

        CardController controller = new CardController(deck, dealer, players, view);

        Scanner sc = new Scanner(System.in);

        while (true) {
            controller.printOptions();
            int option = sc.nextInt();
            if (option == 1) {
                controller.printDeck();
            } else if (option == 2) {
                controller.shuffle();
            } else if (option == 3) {
                controller.deal();
            } else if (option == 4) {
                controller.printHand();
            } else if (option == 5) {
                controller.gather();
            } else if (option == 0) {
                return;
            }
        }
    }
}
