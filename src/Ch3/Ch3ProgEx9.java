package Ch3;

import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx9 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    double bodyWeight;
    
    //input weight in pounds
        System.out.println("Body Weight (Pounds): ");
        bodyWeight = scanner.nextDouble();
        
    //compute calories needed
    double calories = bodyWeight * 19;
    
    //output display
        System.out.println("Calories needed: " + df.format(calories));
    }
    
}
