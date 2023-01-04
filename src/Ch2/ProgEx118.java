package Ch2;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author frank
 */
public class ProgEx118 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String last, first, title;
    System.out.println("Enter First Name: ");
    first = scanner.next();
    System.out.println("Enter Last Name: ");  
    last = scanner.next();
    title = last + ", " + first;
    
    JFrame myWindow = new JFrame();
    myWindow.setVisible(true);
    myWindow.setSize(500,500);
    myWindow.setLocationRelativeTo(null);
    myWindow.setTitle(title);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
