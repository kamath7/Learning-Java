import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccounttTestParametrized {

    private BankAccount bankAccount;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccounttTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup() {
        bankAccount = new BankAccount("Lalle", "Nata", 1000, BankAccount.CHECKING);
        System.out.println("Running a test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {300.00, true, 1300.00}
        });
    }

    @org.junit.Test
    public void getBalance_deposit() {
        bankAccount.deposit(amount, branch);
        assertEquals(expected, bankAccount.getBalance(), 0);
    }
}
