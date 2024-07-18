// 2. Create a BankAccount class to simulate a bank account. The class should have the following attributes: account number, account holder name, and balance.
// Include methods to deposit(), withdraw(), and checkBalance().
// Implement functionality to
// - Create new accounts
// -Deposit money into the account
// - Withdraw money
// - Check the account balance.
public class Task2 {
    public static void main(String[] args){
        BankAccount b1=new BankAccount(123456789, "Nischay Maharjan", 0);
        b1.deposit(10000);
        b1.withdraw(5000);
        System.out.println(b1.checkBalance());

    }
}

class BankAccount{
    public int accountNumber; 
    String accountHolderName; 
    double balance;

    BankAccount(int accountNumber,String Name,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=Name;
        this.balance=balance;
    }

    public void deposit(double amount){
        this.balance=this.balance+amount;
    }
    public double withdraw(double withdrawAmount){
        this.balance=this.balance-withdrawAmount;
        return withdrawAmount;
    }
    public String checkBalance(){
        return ("accountNumber: "+this.accountNumber+"\nAccount Holder Name: "+this.accountHolderName+"\nCurrent Balance: "+this.balance);
    }
}