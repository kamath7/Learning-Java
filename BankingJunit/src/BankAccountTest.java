import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("Executes once before test cases. Count "+count++);
    }

    @org.junit.Before
    //before each test
    public void setUp(){
        bankAccount = bankAccount = new BankAccount("Lalle","Nata",1000, BankAccount.CHECKING);
    }

    @org.junit.Test
    public void deposit() {
        double balance = bankAccount.deposit(200.00D,true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = bankAccount.withdraw(600, true);
        assertEquals(400.00, balance, 0);

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

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("After test cases are run! Count "+count++);
    }

    @org.junit.After
    public void tearDown(){
        count += count;
        System.out.println(count);
    }
}