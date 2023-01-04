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
public class Ch3ProgEx16 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    float weight, mWeight, vWeight, jWeight, sWeight;
    System.out.println("Enter your weight(Kg): ");
    weight = scanner.nextFloat();
    
    mWeight = weight * 0.4f;
    vWeight = weight * 0.9f;
    jWeight = weight * 2.5f;
    sWeight = weight * 1.1f;
    
        System.out.println("You will weigh "+ df.format(mWeight) + "kg on Mercury.\nYou will weigh " +df.format(vWeight) +"kg on Venus."
                + "\nYou will weigh "+df.format(jWeight) +"kg on Jupiter."+ "\nYou will weigh " +df.format(sWeight) + "kg on Saturn.");
    }
}
