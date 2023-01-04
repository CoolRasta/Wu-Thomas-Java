/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Datestring {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String enteredDate ;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Date :");
    enteredDate = scanner.next();
    int y,y1, m, d;
    String stm =enteredDate.substring(0,enteredDate.indexOf("/"));
    String enteredDate2 = enteredDate.substring((enteredDate.indexOf("/")+1), enteredDate.length());
    String std = enteredDate2.substring(0, enteredDate2.indexOf("/"));
    String sty = "20"+enteredDate2.substring((enteredDate2.indexOf("/")+1),enteredDate2.length());
    String date_string = sty+"-"+stm+"-"+ std;
    y = Integer.parseInt(sty);
    m = Integer.parseInt(stm);
    d = Integer.parseInt(std);
    //y = y1 + 1000;
    Date day = new Date(2021,m-1,d);
        System.out.println("y-"+y+"  m-"+m+"  d-"+d);
       
        System.out.println(date_string);
       try{
           Date parse_date = sdf.parse(date_string);
            System.out.println("The Date is : " + parse_date);
       }
       catch(Exception ex){
           
       }
}
}
