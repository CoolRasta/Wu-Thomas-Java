package Ch3;
import java.util.*;

/**
 *
 * @author frank
 */
public class Ch3SelectWinner {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int startingNumber, count, winningNumber, max, min;
        System.out.println("Enter the starting number M: ");
        startingNumber = scanner.nextInt();
        System.out.println("Enter the number of partygoers: ");
        count = scanner.nextInt();
        
        min = startingNumber + 1;
        max = startingNumber + count;
        
        winningNumber = random.nextInt(max-min+1) + min;
        
        System.out.println("The Winning Number is: " + winningNumber);
    }
}
