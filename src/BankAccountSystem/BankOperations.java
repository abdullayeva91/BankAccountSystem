package BankAccountSystem;

public class BankOperations {
    public static void main(String[] args) {
        SavingAccount mySavings= new SavingAccount("SA123",1000.0,0.05);
        CurrentAccount myCurrent= new CurrentAccount("CA456",500.0,-200.0);


        BankAccount[]bankAccounts={mySavings,myCurrent};
        for (BankAccount account:bankAccounts ) {
            System.out.println("---------");
            account.displayAccountInfo();
            account.deposit(200);
            account.withdraw(50);
            account.displayAccountInfo();
            if (account.getAccountNumber().equals("SA123")) {
                mySavings.performTransaction("interest", 0.0);
            } else if (account.getAccountNumber().equals ("CA456")) {
                System.out.println("Cari hesab Ücun faiz tətbiqi yoxdur.");
            }


            mySavings.performTransaction("Withdraw", 1500);
            System.out.println("--------------------------------");
            myCurrent.performTransaction("Withdraw", 1500);
        }

        }


    }

