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
public class WeightConverter {
    double gravity;
    
    public WeightConverter(double planetGravity){
        gravity = planetGravity;
    }
    
    public double convert(double weight){
        return weight * gravity;
    }
}
