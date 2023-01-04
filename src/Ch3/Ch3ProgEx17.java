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
public class Ch3ProgEx17 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    float x;
    float mAge, jAge, sAge, vAge;
        System.out.println("Age: ");
        x = scanner.nextInt();
        
        mAge = (x * 365)/88;
        vAge = (x * 365)/225;
        jAge = (x * 365)/4380;
        sAge = (x * 365)/10767;
        
        System.out.println("Your age will be:\nMercury: " +df.format(mAge) + "\nVenus: " +df.format(vAge) +"\nJupiter: " +df.format(jAge) +"\nSaturn: " + df.format(sAge));
    } 
}
