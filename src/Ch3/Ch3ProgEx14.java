package Ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Ch3ProgEx14 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    double v, r;
    
        System.out.println("Enter Radius: ");
        r = scanner.nextDouble();
        
        v =(Math.PI * Math.pow(r, 3)) * 4/3  ;
        
        System.out.println("Volume of sphere: " + df.format(v));
    }
    
}
