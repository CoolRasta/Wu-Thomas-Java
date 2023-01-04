package Ch2;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author frank
 */
public class ProgEx134 {
    public static void main(String[] args){
    String bDate;
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
    Scanner scanner = new Scanner(System.in);
        System.out.println("Date of Birth: ");
        bDate = scanner.next();
    Date bDay = java.sql.Date.valueOf(bDate);
        System.out.println("You were born on a " + sdf.format(bDay) +".");
    
    }
    
}
