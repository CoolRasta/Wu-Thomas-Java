package Ch3;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author frank
 */
public class Ch3Circle {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.000");
    double radius, c, area;
    final double PI = 22/7;
        System.out.println("Enter Radius: ");
        radius = scanner.nextDouble();
        c = PI*(radius*2);
        area = PI*radius*radius;
        
        System.out.println("Circumference: " + df.format(c));
        System.out.println("Area: " + df.format(area));
        
    }
}
