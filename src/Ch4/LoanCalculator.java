package Ch4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LoanCalculator {
    private Loan loan;
    
    public static void main(String[] args){
        LoanCalculator calculator = new LoanCalculator();
        calculator.start();
    }
    
    public LoanCalculator(){
        
    }
    public void start(){
        describeProgram();
        getInput();
        displayOutput();
    }
    private void describeProgram(){
System.out.println("This program computes the monthly and total");
System.out.println("payments for a given loan amount, annual ");
System.out.println ("interest rate, and loan period (# of years).");
System.out.println("\n");
    }

    private void displayOutput(){
        System.out.println("Loan Amount: $" + loan.getAmount());
        System.out.println("Annual Interest Rate: " + loan.getRate() + "%");
        System.out.println("Loan Period (years): " + loan.getPeriod());
        System.out.println("Monthly Payment is $ " + loan.getMonthlyPayment());
        System.out.println("TOTAL payment is $ " + loan.getTotalPayment());
    }
    private void getInput(){
        double loanAmount, annualInterestRate;
        int loanPeriod;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Loan Amount (Dollars+cents):");
        loanAmount = scanner.nextDouble();
        
        System.out.println("Annual Interest Rate(%):");
        annualInterestRate = scanner.nextDouble();
        
        System.out.println("Loan Period(years):");
        loanPeriod = scanner.nextInt();
        
        loan = new Loan(loanAmount, annualInterestRate,loanPeriod);
        
        
        
    }
    
}
