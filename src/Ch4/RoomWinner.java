package Ch4;

/**
 *
 * @author HP
 */
public class RoomWinner {
    public static void main(String[] args){
        LotteryCard one, two, three;
        
        one = new LotteryCard();
        two = new LotteryCard();
        three = new LotteryCard();
        
        one.spin();
        two.spin();
        three.spin();
        
        System.out.println("Winning Card Combination \n 1-Red; 2-Green; 3-Blue");
        System.out.println("        color   number");
        System.out.println("Card 1: " + one.getColor() + "  " + one.getNumber());
        System.out.println("Card 2: " + two.getColor() + "  " + two.getNumber());
        System.out.println("Card 3: " + three.getColor() + "  " + three.getNumber());
        
    }
}
