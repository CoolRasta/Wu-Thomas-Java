/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch3;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Ch3ProgEx11 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    int year, age;
    
        System.out.println("Enter Year of Birth(yyyy): ");
        year = scanner.nextInt();
        
        age = 2020 - year;
        System.out.println("You were born in "+year +" and will be (are) " +age +" this year.");
    }
}
