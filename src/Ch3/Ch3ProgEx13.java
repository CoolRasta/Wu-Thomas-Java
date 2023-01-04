package Ch3;

import java.util.Scanner;
import java.text.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx13 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    double p, r, n, total;
    
        System.out.println("Investment amount: ");
        p = scanner.nextDouble();
        System.out.println("Interest rate (p.a):");
        r = scanner.nextDouble();
        System.out.println("Period (years): ");
        n = scanner.nextDouble();
        
        total = p * Math.pow((1+r/100.0),n);
        
        System.out.println("Total amount: " + df.format(total));
    }    
}
