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
public class Circle {
    double radius;
    public Circle(double r){
        radius = r;
    }
    
    public double area(){
        return (Math.PI * radius * radius);
    }
    public double circumference(){
        return (Math.PI * 2 * radius);
    }
    
    
}
