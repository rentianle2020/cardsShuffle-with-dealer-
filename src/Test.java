import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Deck deck = new Deck();

        dealer.shuffle(deck);

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("张三"));
        playerList.add(new Player("李四"));
        playerList.add(new Player("王五"));

        dealer.deal(deck,playerList);

        for(Player player:playerList){
            System.out.println(player);
        }

        dealer.gather(deck,playerList);
    }
}
