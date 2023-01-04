package Ch3;

import java.util.*;
import java.text.*;

public class Ch3ProgEx20{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
    System.out.println("Enter Date (MM/dd/yyyy): ");
    String date = scanner.next();
    int month, day, year;
    
    month = Integer.parseInt(date.substring(0,2));
    date = date.substring(date.indexOf("/")+1, date.length());
    day = Integer.parseInt(date.substring(0,2));
    year = Integer.parseInt(date.substring(date.indexOf("/")+1, date.length()));
    
GregorianCalendar cal = new GregorianCalendar(year, month-1, day);

    System.out.println("You were born on a " + sdf.format(cal.getTime())+ ".");
}
}