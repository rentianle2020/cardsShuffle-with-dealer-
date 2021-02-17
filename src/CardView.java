public class CardView {

    public static void printOptions(){
        System.out.println("==========================================");
        System.out.println("欢迎来到自动洗牌发牌系统，请输入数字来执行牌局功能");
        System.out.println("1.查看当前牌组");
        System.out.println("2.洗牌");
        System.out.println("3.发牌");
        System.out.println("4.查看所有玩家手牌");
        System.out.println("5.收牌");
        System.out.println("0.退出系统");
    }

    public static void printDeck(Deck deck){
        System.out.println("牌堆信息:"+deck);
    }

    public static void printHand(Player player){
        System.out.println("玩家姓名:"+player.getName());
        System.out.println("手牌信息:"+player.getHand());
    }

    public static void shuffleResult(){
        System.out.println("洗牌完毕");
    }

    public static void gatherResult(){
        System.out.println("收牌完毕");
    }

    public static void dealResult(){
        System.out.println("发牌完毕");
    }
}
