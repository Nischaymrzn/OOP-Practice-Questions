// 4. Question Design and implement a Java program that simulates a financial transaction system. Your system should be capable of processing different types of transactions, 
//such as deposits and withdrawals, and alerting if any transactions exceed certain limits. Use interfaces to define common behaviors for transactions and implement 
//these behaviors in different transaction classes.
// Create an interface named Transaction with at least two methods:
// getAmount() which returns the amount of the transaction as a double
// isValid() which returns a boolean indicating if the transaction is valid based on certain criteria.
// Implement the Transaction interface in at least three separate classes,
// DepositTransaction and Withdrawal Transaction. Each class should have a constructor that sets a limit for transactions and specific logic to determine if the transaction is valid.
public class Task4 {
    public static void main(String[] args) {
        // Setting limits for transactions
        double depositLimit = 5000.0;
        double withdrawalLimit = 1000.0;
        double transferLimit = 2000.0;

        // Creating instances of concrete transaction classes
        DepositTransaction deposit1 = new DepositTransaction(4500.0, depositLimit);
        System.out.println(deposit1.alertMessage());
       

        WithdrawTransaction withdrawal1 = new WithdrawTransaction(500.0, withdrawalLimit);
        System.out.println(withdrawal1.alertMessage());
      

        TransferTransaction transfer1 = new TransferTransaction(2500.0, transferLimit);
        System.out.println(transfer1.alertMessage());
        
    }
    
}

interface Transaction{
    double getAmount();
    boolean isValid();
}

class DepositTransaction implements Transaction{
    private double amount;
    private double limit;
    public DepositTransaction(double amount,double limit){
        this.amount=amount;
        this.limit=limit;
    }
    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }

    public String alertMessage() {
        return "Deposit of Rs." + amount + (isValid() ? " is valid." : " exceeds the limit.");
    }
}

class WithdrawTransaction implements Transaction{
    private double amount;
    private double limit;
    public WithdrawTransaction(double amount,double limit){
        this.amount=amount;
        this.limit=limit;
    }
    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }

    public String alertMessage() {
        return "Withdrawl of Rs." + amount + (isValid() ? " is valid." : " exceeds the limit.");
    }
}

class TransferTransaction implements Transaction{
    private double amount;
    private double limit;
    public TransferTransaction(double amount,double limit){
        this.amount=amount;
        this.limit=limit;
    }
    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }

    public String alertMessage() {
        return "Transfer of Rs." + amount + (isValid() ? " is valid." : " exceeds the limit.");
    }
}