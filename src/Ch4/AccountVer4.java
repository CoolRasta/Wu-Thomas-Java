package Ch4;
class AccountVer4 {
    private static final double FEE = 0.50;
    private String ownerName;
    private double balance;
    
    public AccountVer4(String name, double startingBalance){
        ownerName = name;
        balance = startingBalance;
    }
    public void deduct(double amt){
        adjust(- (amt + FEE));
    }
    public void add(double amt){
        adjust(amt);
    }
    private void adjust(double adjustAmt){
        balance = balance + adjustAmt;
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
