package Ch4;

import java.util.*;
import java.text.*;
public class WeightCalc {
    public static void main(String[] args){
        Height hgt;
        Scanner scanner = new Scanner(System.in);
       // scanner.useDelimiter(System.getProperty("line.separator"));
        DecimalFormat df = new DecimalFormat("0.00");
        hgt = new Height();
        System.out.println("Enter user age (years): ");
        hgt.setAge(scanner.nextInt());
        System.out.println("Enter user height (cm): ");
        hgt.setHeight(scanner.nextInt());
        hgt.computeWeight(hgt.getAge(), hgt.getHeight());
        
        System.out.println("Recommended Weight: " + df.format(hgt.getWeight()) + " Kgs.");
    }
}
