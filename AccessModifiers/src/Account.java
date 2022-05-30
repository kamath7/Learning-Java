import java.util.ArrayList;

public class Account {

    public String accountName;
    public double balance = 0;
    private ArrayList<Integer> transaction;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transaction = new ArrayList<>();
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

    public void calculateBalance(){
        this.balance = 0;
        for (int i : this.transaction){
            this.balance += i;
        }
        System.out.println("Balance currently at "+this.balance);
    }
}
