import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount bankAccount;

    @org.junit.Before
    public void setUp(){
        bankAccount = bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
        System.out.println("Running");
    }

    @org.junit.Test
    public void deposit() {
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("Yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        double balance = bankAccount.withdraw(200.00D,true);
        assertEquals(800, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue("Account is not a checking account",bankAccount.isChecking());
    }
}