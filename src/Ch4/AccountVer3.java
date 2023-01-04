package Ch4;
class AccountVer3 {
    private static final double FEE = 0.50;
    private String ownerName;
    private double balance;
    
    public AccountVer3(String name, double startingBalance){
        ownerName = name;
        balance = startingBalance;
    }
    public void deduct(double amt){
        balance = balance - amt - FEE;
    }
    public void add(double amt){
        balance = balance + amt - FEE;
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
