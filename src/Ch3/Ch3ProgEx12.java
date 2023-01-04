/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Ch3ProgEx12 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.000");
    
    int weight, height;
    double bmi;
        System.out.println("Weight (Kgs): ");
        weight = scanner.nextInt();
        System.out.println("Height (cm): ");
        height = scanner.nextInt();
        
     bmi = weight/ Math.pow((height/100.0),2);
        System.out.println("Body Mass Index (BMI): " + df.format(bmi));
    }
}
