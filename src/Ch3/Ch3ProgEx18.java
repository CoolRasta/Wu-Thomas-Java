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
 * @author frankd
 */
public class Ch3ProgEx18 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Enter value of A: " );
        int a = scanner.nextInt();
        System.out.println("Enter value of B: ");
        int b = scanner.nextInt();
        System.out.println("Enter value of C: ");
        int c = scanner.nextInt();
        
        double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2 * a);
        
        System.out.println("x = "+df.format(x1)+ " or "+df.format(x2)+ ".");
    }
}
