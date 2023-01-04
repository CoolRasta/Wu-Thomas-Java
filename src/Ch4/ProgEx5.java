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
public class ProgEx5 {
    public static void main(String[] args){
        int roll1, roll2, roll3;
        Die die = new Die();
        
        //First Roll
        die.roll();
        roll1 = die.getNumber();
        
        //Second Roll
        die.roll();
        roll2 = die.getNumber();
        
        //Third Roll
        die.roll();
        roll3 = die.getNumber();
        
        System.out.println("The Results of Three Rolls of the die are; "
                                     + roll1 + " " + roll2 + " " + roll3);
    }
}
