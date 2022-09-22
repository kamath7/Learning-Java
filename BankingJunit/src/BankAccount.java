public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int acctType;
    public BankAccount(String firstName, String lastName, double balance, int typeOfAcct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.acctType = typeOfAcct;
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

    public boolean isChecking() {
        return acctType == CHECKING;
    }
}
