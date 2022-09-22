import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("Yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
        double balance = bankAccount.withdraw(200.00D,true);
        assertEquals(800, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking());
    }
}