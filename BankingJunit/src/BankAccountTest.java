import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000);
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("Yet to be implemented");
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000);
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, balance, 0);
        assertEquals(1200, bankAccount.getBalance(), 0);
    }

}