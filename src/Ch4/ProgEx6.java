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
public class ProgEx6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalSales, numberOfA_Seats, numberOfB_Seats, numberOfC_Seats, A_SeatPrice, B_SeatPrice, C_SeatPrice;
        
        System.out.println("Seat A Price: ");
        A_SeatPrice = scanner.nextInt();
        System.out.println("Seat B Price: ");
        B_SeatPrice = scanner.nextInt();
        System.out.println("Seat C Price: ");
        C_SeatPrice = scanner.nextInt();
        System.out.println("Seat A Tickets sold: ");
        numberOfA_Seats = scanner.nextInt();
        System.out.println("Seat B Tickets sold: ");
        numberOfB_Seats = scanner.nextInt();
        System.out.println("Seat C Tickets sold: ");
        numberOfC_Seats = scanner.nextInt();
        
        totalSales = ((numberOfA_Seats*A_SeatPrice) + (numberOfB_Seats*B_SeatPrice) + (numberOfC_Seats*C_SeatPrice));
        
        System.out.println("Total Sales: " + totalSales + "Ksh");
    }
}
