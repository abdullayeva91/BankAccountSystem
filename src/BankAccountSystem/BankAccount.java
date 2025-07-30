package BankAccountSystem;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialbalance) {
        this.accountNumber = accountNumber;
        this.balance =Math.max(0.0, initialbalance);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    protected void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = balance;
    }
    public  void deposit(double amount){
        balance=balance+amount;
    }
    public abstract void withdraw(double amount);

     public abstract void displayAccountInfo();
}
