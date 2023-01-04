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
public class Ch3ProgEx23 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    double r;
    int c, t, v;
    final double K = 2.5E2;
    
        System.out.println("Enter no. of lines with comments (C): ");
        c = scanner.nextInt();
        System.out.println("Time spent (min): ");
        t = scanner.nextInt();
        System.out.println("Number of lines with nondescriptive variable names (V): ");
        v = scanner.nextInt();
        
        r = (K * c * Math.pow(t, 2))/Math.pow(v, 3);
        
        System.out.println("Degree of Program Readability R = " + df.format(r) + " mocha");
    }
}
