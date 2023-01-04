package Ch3;

import java.util.*;
import java.text.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx7 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    double cm, inches, feet;
    final double CM_IN_INCHES = 2.54;
    final double INCHES_IN_FOOT = 12;
    //input value to be converted
        System.out.println("Enter Value (cm): ");
        cm = scanner.nextDouble();
    //converting cm to inches and feet    
        inches = cm/CM_IN_INCHES;
        feet = inches/INCHES_IN_FOOT;
    //Displaying converted values
        System.out.println("Inches: " + df.format(inches));
        System.out.println("Feet: " + df.format(feet));
    }    
}
