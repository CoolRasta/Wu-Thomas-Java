/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProgEx13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Seat seatA, seatB, seatC;
        int totalSales, numberOfA_Seats, numberOfB_Seats, numberOfC_Seats;
        
        System.out.println("Seat A Price: ");
        seatA = new Seat(scanner.nextInt());
        System.out.println("Seat B Price: ");
        seatB = new Seat(scanner.nextInt());
        System.out.println("Seat C Price: ");
        seatC = new Seat(scanner.nextInt());
        
        
        System.out.println("Seat A Tickets sold: ");
        numberOfA_Seats = scanner.nextInt();
        System.out.println("Seat B Tickets sold: ");
        numberOfB_Seats = scanner.nextInt();
        System.out.println("Seat C Tickets sold: ");
        numberOfC_Seats = scanner.nextInt();
        
        totalSales = ((numberOfA_Seats*seatA.getPrice()) + (numberOfB_Seats*seatB.getPrice()) + (numberOfC_Seats*seatC.getPrice()));
        
        System.out.println("Total Sales: " + totalSales + "Ksh");
    }
}
