package bankingtransactiontest;

import bankingtransaction.BankAccount;  

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount();
    }

    // Test to check balance updates after deposits
    @Test
    public void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    // Test to check balance updates after withdrawals
    @Test
    public void testWithdraw() {
        account.deposit(100);
        assertTrue(account.withdraw(50));
        assertEquals(50, account.getBalance());
        assertFalse(account.withdraw(100));
        assertEquals(50, account.getBalance());
    }
}
