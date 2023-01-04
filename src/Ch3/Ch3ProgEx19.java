/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch3;
import java.util.*;
/**
 *
 * @author frank
 */
public class Ch3ProgEx19 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int y1, m1, d1, y2, m2, d2;
        System.out.println("First day of semester\nYear (yyyy): ");
        y1 = scanner.nextInt();
        System.out.println("Month (1-12): ");
        m1 = scanner.nextInt();
        System.out.println("Day (1-31): ");
        d1 = scanner.nextInt();
        
    GregorianCalendar cal1 = new GregorianCalendar(y1,m1-1,d1);
    
        System.out.println("Last day of semester\nYear (yyyy): ");
        y2 = scanner.nextInt();
        System.out.println("Month (1-12): ");
        m2 = scanner.nextInt();
        System.out.println("Day (1-31): ");
        d2 = scanner.nextInt();
        
    GregorianCalendar cal2 = new GregorianCalendar(y2,m2-1,d2);    
    
        System.out.println("This semester had " + (cal2.get(Calendar.DAY_OF_YEAR) - cal1.get(Calendar.DAY_OF_YEAR)) + " days.");
    }
}
