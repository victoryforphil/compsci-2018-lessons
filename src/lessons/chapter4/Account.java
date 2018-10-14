package lessons.chapter4;

import java.text.NumberFormat;

public class Account {
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final double RATE = 0.035;
    private int acctNumber;
    private double balance;
    private String name;

    public Account(String owner, int account) {
        name = owner;
        acctNumber = account;
        balance = 0.0;
    }

    public Account(String owner, int account, double intial){
        name = owner;
        acctNumber = account;
        balance = intial;
    }

    public boolean transfer(Account to, double amount){
        if(balance < amount){
            System.out.println();
            System.out.println("Error: Insufficient funds.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
            System.out.println("Avaible: " + fmt.format(balance));

            return false;
        }

        withdraw(amount, 0.0);
        to.desposit(amount);
        System.out.println();
        System.out.println("Trasfered!");
        System.out.println("To: " + to);
        System.out.println("Amount: " +fmt.format(amount));
        return true;

    }

    public double desposit(double amount){
        if(amount < 0){
            System.out.println();
            System.out.println("Error: Deposit amount is invalid.");
            System.out.println(acctNumber + " " + fmt.format(amount));
        }else{
            balance = balance + amount;
        }

        return balance;
    }

    public double withdraw(double amount, double fee){
        amount += fee;

        if (amount < 0){
            System.out.println();
            System.out.println("Error: Withdraw amount is invalid.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
        }else{
            if(amount > balance){
                System.out.println();
                System.out.println("Error: Insufficient funds.");
                System.out.println("Account: " + acctNumber);
                System.out.println("Requested: " + fmt.format(amount));
                System.out.println("Avaible: " + fmt.format(balance));
            }else{
                balance = balance - amount;
            }
        }

        return balance;
    }

    public double addIntrest(){
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String toString() {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
