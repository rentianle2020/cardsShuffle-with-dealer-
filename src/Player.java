import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name = "匿名玩家";

    private final List<Card> hand = new ArrayList<>();


    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    public void clearHand(){
        hand.clear();
    }

    @Override
    public String toString() {
        return "玩家姓名：" + name + "   玩家手牌：" + hand;
    }
}


