public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public double deposit(double amt, boolean branch){
        balance += amt;
        return balance;
    }

    public double withdraw(double amt, boolean branch){
        balance -= amt;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
