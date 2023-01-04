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

public class ProgEx9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double radius1, radius2;
        
        System.out.println("Radius of outer circle: ");
        radius1 = scanner.nextDouble();
        System.out.println("Radius of inner circle: ");
        radius2 = scanner.nextDouble();
        
        Circle circle1, circle2;
        circle1 = new Circle(radius1);
        circle2 = new Circle(radius2);
        
        System.out.println("Area of Outer Circle: " + df.format(circle1.area()) + "cm squared");
        System.out.println("Area of Inner Circle: " + df.format(circle2.area()) + "cm squared");
        System.out.println("Area of Shadded Region: " + df.format(circle1.area() - circle2.area()) + "cm squared");
        System.out.println("Circumference of Outer Circle: " + df.format(circle1.circumference()) + "cm");
        System.out.println("Circumference of Inner Circle: " + df.format(circle2.circumference()) + "cm");
    }
}
