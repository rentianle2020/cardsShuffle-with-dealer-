import java.util.List;

public class View {
    public void printDealerDeck(Dealer dealer){
        Deck deck = dealer.getDeck();
        List<Card> cards = deck.getCards();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("牌堆信息:[");
        printCards(stringBuffer,cards);
        stringBuffer.append("]");
        System.out.println(stringBuffer);
    }

    public void printPlayerHands(List<Player> players){
        StringBuffer stringBuffer = new StringBuffer();
        for(Player player : players){
            stringBuffer.append(player.getName());
            stringBuffer.append("的手牌为:[");
            List<Card> cards = player.getHand();
            printCards(stringBuffer,cards);
            stringBuffer.append("]\n");
        }
        System.out.println(stringBuffer);
    }

    public static void printCards(StringBuffer stringBuffer,List<Card> cards){
        for (int i = 0; i < cards.size(); i++) {
            stringBuffer.append(cards.get(i).getSuit());
            stringBuffer.append(cards.get(i).getRank());
            if(i != cards.size()-1){
                stringBuffer.append(",");
            }
        }
    }
}
