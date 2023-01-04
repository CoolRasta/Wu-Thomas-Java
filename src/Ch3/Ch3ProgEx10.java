package Ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Ch3ProgEx10 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    
    double fahrenheit, celsius;
    
        System.out.println("Temerature in Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        
     celsius = (fahrenheit - 32) * 5/9;
     
        System.out.println("Temperature in Degrees Celsius: " + df.format(celsius));
    }
    
}
