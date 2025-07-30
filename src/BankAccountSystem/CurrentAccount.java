package BankAccountSystem;

public class CurrentAccount extends BankAccount implements ITransactable{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialbalance, double overdraftLimit) {
        super(accountNumber, initialbalance);
        this.overdraftLimit =overdraftLimit;

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()-overdraftLimit<0){
            System.out.println("Kifayət gədər vəsait yoxdur!");
        }else {
            setBalance(getBalance()-amount);
            System.out.println("Mənfi məbləğ çıxarıla bilməz!");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Cari Hesab"+getAccountNumber()+"Balans:"+getBalance()+"Overdrift Limit"
                +getOverdraftLimit());
    }

    @Override
    public void performTransaction(String type, double amount) {
        switch (type) {
            case "deposit":
                deposit(amount);
                break;
            case "withdraw":
                withdraw(amount);
                break;
            default:
                System.out.println("Naməlum Əməliyyat növü.");

        }
    }
}
