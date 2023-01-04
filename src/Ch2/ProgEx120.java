package Ch2;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author frank
 */
public class ProgEx120 {
    public static void main(String[] args){
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMMM yyyy");
    System.out.println("Today is " + sdf.format(today));
    
 /*   double g = 34.2787;
        System.out.println(g);
        
        int x = 23, y;
        
        double h = x;*/
    }
    
}
