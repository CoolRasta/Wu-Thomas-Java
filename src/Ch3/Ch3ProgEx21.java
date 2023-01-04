/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch3;
import java.util.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx21 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        double fn;
        
        fn = (1/Math.sqrt(5))*(Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n));
        
        System.out.println("N th Fibonacci number: " + Math.round(fn));
    }
}
