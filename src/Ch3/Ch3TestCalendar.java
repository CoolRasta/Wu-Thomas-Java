package Ch3;
import java.util.*;
import java.text.*;

/**
 *
 * @author frank
 */
public class Ch3TestCalendar {
    public static void main(String[] args){
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(cal.getTime());
        System.out.println("Year: " + cal.get(Calendar.YEAR) +  "\nMonth: " + sdf.format(cal.get(Calendar.MONTH)));
        GregorianCalendar bday = new GregorianCalendar(1996, Calendar.APRIL, 17);
        System.out.println("You were born on a " + sdf.format(bday.getTime()));
    }    
}
