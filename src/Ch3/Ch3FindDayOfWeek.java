package Ch3;
import java.util.*;
import java.text.*;
/**
 *
 * @author frank
 */
public class Ch3FindDayOfWeek {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("EEEEE");
    int day, month, year;
    
        System.out.println("Year (yyyy): ");
        year = scan.nextInt();
        System.out.println("Month (1-12): ");
        month = scan.nextInt();
        System.out.println("Day (1-31): ");
        day = scan.nextInt();
        
    GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        System.out.println("You were born on a "+ sdf.format(cal.getTime()) + ".");
    }
}
