package Ch2;
import java.util.*;
/**
 *
 * @author frank
 */
public class ProgEx119 {
    public static void main(String[] args){
    String first, middle, last;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter First Name: ");
    first = scanner.next();
    System.out.println("Enter Middle Name: ");
    middle = scanner.next();
    System.out.println("Enter Last Name: ");
    last = scanner.next();
    System.out.println("Name: " + first +" "+ middle.substring(0,1) + ". " + last);
    }
}
