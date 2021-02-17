import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name = "无名玩家";

    private List<Card> hand = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ":" + hand;
    }
}
