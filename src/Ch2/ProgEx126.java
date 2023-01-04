package Ch2;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class ProgEx126 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String text;
    scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter Text: ");
    text = scanner.next();
        System.out.println(text.substring(0, text.indexOf("!")));
        System.out.println(text.substring(text.indexOf("!")+2, text.length()));
    }
}
