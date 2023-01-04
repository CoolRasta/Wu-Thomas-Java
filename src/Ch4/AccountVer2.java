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
public class AccountVer2 {
    private String ownerName;
    private double balance;
    
    public AccountVer2(String name, double startingBalance){
        ownerName =  name;
        balance = startingBalance;
    }
    
    public void add(double amt){
        balance = balance + amt;
    }
    
    public void deduct(double amt){
        balance = balance - amt;
    }
    public double getCurrentBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
}
