package Ch2;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class ProgEx127 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    String text, middle;
        System.out.println("Enter Text: ");
        text = scanner.next();
        System.out.println("No. of Characters: " + text.length());
        System.out.println("First Character: " + text.substring(0,1));
        System.out.println("Last Character: " + text.substring(text.length()-1,text.length()));
        
        middle = text.substring(text.length()/2, (text.length()/2)+1);
        System.out.println("Middle Character: " + middle);
    
    }
    
}
