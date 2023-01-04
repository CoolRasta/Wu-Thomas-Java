/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch3;
import java.util.*;
import java.text.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx22 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.0000");
    final double k = 6.62E-8;
    double m1,m2,d;
    
        System.out.println("Mass of first body (m1): ");
        m1 = scanner.nextDouble();
        System.out.println("Mass of second body (m2): ");
        m2 = scanner.nextDouble();
        System.out.println("Distance between the bodies (d): ");
        d = scanner.nextDouble();
        
    double f = k *((m1*m2)/Math.pow(d, 2));
    
        System.out.println("Force between the bodies: " + df.format(f) +" dyn.");
    }    
}
