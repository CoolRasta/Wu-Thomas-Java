/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author HP
 */
public class ProgEx14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        WeightConverter moonWeight, mercuryWeight, venusWeight, jupiterWeight, saturnWeight;
        
        moonWeight = new WeightConverter(0.167);
        mercuryWeight = new WeightConverter(0.4);
        venusWeight = new WeightConverter(0.9);
        jupiterWeight = new WeightConverter(2.5);
        saturnWeight = new WeightConverter(1.1);
        
        System.out.println("Enter your weight on Earth (Kgs): ");
        double weight = scanner.nextInt();
        
        System.out.println("You will weigh "+ df.format(mercuryWeight.convert(weight)) 
                + "kgs on Mercury.\nYou will weigh " +df.format(venusWeight.convert(weight)) +"kgs on Venus."
                + "\nYou will weigh "+df.format(jupiterWeight.convert(weight)) +"kgs on Jupiter."
                + "\nYou will weigh " +df.format(saturnWeight.convert(weight)) + "kgs on Saturn."
        + "\nYou will weigh "+df.format(moonWeight.convert(weight)) +"kgs on the moon.");
    }
}
