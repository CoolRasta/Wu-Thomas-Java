package Ch4;

/**
 *
 * @author HP
 */
public class Account {
    private String ownerName;
    private double balance;
    
    public Account(){
        ownerName = "Unassigned";
        balance = 0.0;
    }
    
    public void add(double amt){
        balance = balance + amt;
    }
    
    public void deduct(double amt){
        balance = balance - amt;
    }
    
    public void setInitialBalance(double theBalance){
        balance = theBalance;
    }
    
    public double getCurrentbalance(){
        return balance;
    }
    
    public void setOwnerName(String name){
        ownerName = name;
    }
 
    public String getOwnerName(){
        return ownerName;
    }
}
