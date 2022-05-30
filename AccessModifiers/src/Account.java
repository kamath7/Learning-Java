import java.util.ArrayList;

public class Account {

    public String accountName;
    public double balance = 0;
    public ArrayList<Integer> transaction;

    public Account(String accountName, ArrayList<Integer> transaction) {
        this.accountName = accountName;
        this.transaction = transaction;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transaction.add(amount);
            this.balance += amount;
            System.out.println("Amount " + amount + " deposited. Bank balance currently at " + this.balance);
        } else {
            System.out.println("amount of negative sums cannot be deposited");
        }
    }

    public void withdrawal(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transaction.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " has been withdrawn. Balance currently at " + this.balance);
        }else{
            System.out.println("cannot withdraw");
        }
    }
}
