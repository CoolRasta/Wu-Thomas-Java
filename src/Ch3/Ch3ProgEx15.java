package Ch3;

import java.util.*;
import java.text.*;

/**
 *
 * @author frank
 */
public class Ch3ProgEx15 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    double r, v;
    final double MASS_OF_EARTH = 5.98E24;
    final double GRAVITATIONAL_CONSTANT = 6.67E-11;
        System.out.println("Enter Radius: ");
        r = scanner.nextDouble();
        
        v = Math.sqrt((GRAVITATIONAL_CONSTANT*MASS_OF_EARTH)/r);
        
        System.out.println("Velocity of Satellite: " + df.format(v));
    }    
}
