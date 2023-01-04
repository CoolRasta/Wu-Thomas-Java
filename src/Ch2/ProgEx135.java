package Ch2;
import java.util.*;

/**
 *
 * @author frank
 */
public class ProgEx135 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter your full name: ");
        String name = scanner.next();
        
        String first,middle,last;
        first = name.substring(0,name.indexOf(" "));
        name = name.substring(name.indexOf(' ')+1, name.length());
        middle = name.substring(0, name.indexOf(" "));
        last = name.substring(name.indexOf(" ")+1, name.length());
        
        System.out.println(last + ", " + first + " " + middle.substring(0,1) + ".");
    }
    
}
