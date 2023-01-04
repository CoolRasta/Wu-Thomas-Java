package Ch4;

/**
 *
 * @author HP
 */
public class NewMain {
    public static void main(String[] args){
    Bicycle bike;
    Account acc;
    Student owner;
    
    String myName = "Frankline Mwenda";
    owner = new Student();
    bike = new Bicycle();
    bike.setOwner(owner);
    owner.setName(myName);
    
    acc = new Account();
    acc.setInitialBalance(250.00);
    acc.setOwnerName(myName);
    
    acc.add(25.00);
    acc.deduct(50);
    
        System.out.println(bike.getOwnerName() + " owns a bicycle and has $" + acc.getCurrentbalance() + " left in the bank.");
    }
}
