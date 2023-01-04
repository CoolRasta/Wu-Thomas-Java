package Ch2;
import java.util.*;
/**
 *
 * @author frank
 */
public class Ch2Monogram {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    System.out.println("Enter Your Full Name: ");
    String fullName = scanner.next();
    System.out.println("Your Full Name is "+ fullName);
    
    String first, middle, last, monogram;
    first = fullName.substring(0, fullName.indexOf(" "));
    System.out.println("First: " + first);
    fullName = fullName.substring(fullName.indexOf(" ")+1,fullName.length());
    middle = fullName.substring(0, fullName.indexOf(" "));
    System.out.println("Middle: " + middle);
    last = fullName.substring(fullName.indexOf(" ")+1, fullName.length());
    System.out.println("Last: "+ last);
    
    monogram = first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
    System.out.println(monogram);
    }
}
