/**
 *
 * @author supan
 */
class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance>0 ? initialBalance : 0;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("\nDeposited: "+amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public boolean withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
            return true;
        } else{
            System.out.println("Insufficient balance");
            return false;
        }
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;
    private static final double WITHDRAWAL_FEE = 5.0;
    
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate){
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    @Override
    public boolean withdraw(double amount){
        double totalAmount = amount+ WITHDRAWAL_FEE;
        if(totalAmount>0 && totalAmount<=getBalance()){
            super.withdraw(totalAmount);
            System.out.println("Withdrawal fee of " + WITHDRAWAL_FEE + " applied.");
            return true;
        } else {
            System.out.println("Insufficient balance including withdrawal fee.");
            return false;
        }
    }
    public void applyInterest(){
        double interest = getBalance()*(interestRate/100);
        deposit(interest);
        System.out.println("Interest applied: "+interest);
    }
}
public class BankAccounts{
    public static void main(String[] args) {
        BankAccount regular = new BankAccount("10254122", 1200);
        SavingsAccount savings = new SavingsAccount("20257490", 2000, 1.45);
        
         System.out.println("Before Transactions:");
        regular.displayDetails();
        savings.displayDetails();

        regular.deposit(500);
        regular.withdraw(300);

        savings.deposit(1000);
        savings.withdraw(500);
        savings.applyInterest();

        System.out.println("\nAfter Transactions:");
        regular.displayDetails();
        savings.displayDetails();
    }
}
