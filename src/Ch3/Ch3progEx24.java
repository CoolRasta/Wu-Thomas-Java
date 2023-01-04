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
public class Ch3progEx24 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int unitWeight, numberOfUnits;
    double totalPrice, totalPriceWithTax;
    
        System.out.println("Number of bags sold: ");
        numberOfUnits = scanner.nextInt();
        System.out.println("Weight per bag: ");
        unitWeight = scanner.nextInt();
        System.out.println("\nNumber of bags sold: " + numberOfUnits);
        System.out.println("     Weight per bag: " + unitWeight + " lb");
        System.out.println("    Price per pound: $5.99");
        System.out.println("          Sales tax: 7.25%\n");
        
        totalPrice = unitWeight * numberOfUnits * 5.99;
        totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("        Total price: $" +totalPriceWithTax);
    }
}
