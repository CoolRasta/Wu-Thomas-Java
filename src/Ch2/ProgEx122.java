package Ch2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author frank
 */
public class ProgEx122 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    JFrame myWindow = new JFrame();
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
    String h, w, title;
    System.out.println("Enter Frame Width: ");
    w = scanner.next();
    System.out.println("Enter Frame Height: ");
    h = scanner.next();
    System.out.println("Enter Frame Title: ");   
    title = scanner.next();
    
    myWindow.setVisible(true);
    myWindow.setSize(500,400);
    myWindow.setTitle(sdf.format(today));
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myWindow.setLocationRelativeTo(null);
    }
    
}
