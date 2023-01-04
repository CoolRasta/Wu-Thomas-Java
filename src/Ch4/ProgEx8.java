/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class ProgEx8 {
    public static void main(String[] args){
        Temperature tmp = new Temperature();
        double inputTemp;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Enter Temperature (Celsius): ");
        inputTemp = scanner.nextDouble();
        
        tmp.setCelsius(inputTemp);
        
        System.out.println("input Temp: " + tmp.temp);
        
        System.out.println("Temperature in Fahrenheit: " + df.format(tmp.toFahrenheit()));
        
    }
}
