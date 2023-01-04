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
public class Temperature {
    double temp;
    
    public Temperature(){
        temp = 0.00;
    }
    public void setFahrenheit(double fahrenheit){
        temp = fahrenheit;
    }
    public void setCelsius(double celsius){
        temp = celsius;
    }
    
    public double toCelsius(){
        double tempCelsius = (temp - 32) * 5/9;
        System.out.println(tempCelsius);
        return tempCelsius;
    }
    public double toFahrenheit(){
        return (1.8 * temp) + 32;
    }
}
