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
public class BicycleVer2 {
    private String ownerName;
    
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
    public static void main(String[] args){
        BicycleVer2 myBike;
        myBike = new BicycleVer2();
        myBike.setOwnerName("Frankie Kagendo");
        System.out.println("This bike is owned by " + myBike.getOwnerName() + ".");
    }
}
