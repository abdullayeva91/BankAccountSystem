package BankAccountSystem;

public class SavingAccount extends BankAccount implements ITransactable{
    private double interestRate;

    public SavingAccount(String accountNumber, double initialbalance, double interestRate){
        super(accountNumber, initialbalance);
        this.interestRate =Math.max(0.0-1.0, interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void applyInterest(){
        double interest = getBalance()*interestRate;
        setBalance(+interest);
    }


    @Override
    public void withdraw(double amount) {
        if (amount<0){
            System.out.println("Balansda kifayət gədər vəsait yoxdur!");
        }else {
            setBalance(getBalance()-amount);
            System.out.println("Mənfi məbləg cıxarila bilməz!");
        }

    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Əmanət Hesabı:"+getAccountNumber()+"Balans"+getBalance()+"$"+"Faiz"+getInterestRate()
                *100+"%");

    }

    @Override
    public void performTransaction(String type, double amount) {

        switch (type){
            case "deposit":
               deposit(amount);
               break;
            case "withdraw":
                withdraw(amount);
                break;
            case "interest":
                applyInterest();
                break;
            default:
                System.out.println("Naməlum Əməliyyat növü.");

        }
    }
}
