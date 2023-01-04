 package Ch4;


/**
 *
 * @author HP
 */
public class Loan {
    private final int MONTHS_IN_YEAR = 12;
    private double loanAmount;
    private double monthlyInterestRate;
    private int numberOfPayments;
    
    public Loan(double amount, double rate, int period){
        setAmount(amount);
        setRate(rate);
        setPeriod(period);
    }
    
    public void setAmount(double amount){
        loanAmount = amount;
    }
    public double getAmount(){
        return loanAmount;
    }
    
    public void setRate(double annualRate){
        monthlyInterestRate = annualRate/100/MONTHS_IN_YEAR;
    }
    public double getRate(){
        return monthlyInterestRate * 100.0 * MONTHS_IN_YEAR;
    }
    
    public void setPeriod(int periodInYears){
        numberOfPayments = periodInYears * MONTHS_IN_YEAR;
    }
    public int getPeriod(){
        return numberOfPayments / MONTHS_IN_YEAR;
    }
    
    public double getMonthlyPayment(){
         double monthlyPayment;
         monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1/(1 + monthlyInterestRate), numberOfPayments));
         return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfPayments;
        return totalPayment; 
    }
}
