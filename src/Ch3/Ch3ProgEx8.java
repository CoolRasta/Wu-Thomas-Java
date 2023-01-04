package Ch3;

import java.util.*;
import java.text.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx8 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
        double celsius, fahrenheit;
    
        System.out.println("Enter Temperature(Celsius): ");
        celsius = scanner.nextDouble();
        
        fahrenheit = (1.8*celsius) + 32;
        
        System.out.println("Fahrenheit: " + df.format(fahrenheit));
    }    
}
