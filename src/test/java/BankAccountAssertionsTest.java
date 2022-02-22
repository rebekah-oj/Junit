import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@DisplayName("Test Bank Account Class")
public class BankAccountAssertionsTest {

    @Test
    @DisplayName("Withdraw 300 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        Assertions.assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 600 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.deposit(600);
        Assertions.assertEquals(1100, bankAccount.getBalance());
    }

     @Test
     @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        Assertions.assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test Activation Account After creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, 0);
        Assertions.assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Test Holder Name")
    public void testHolderName(){
     BankAccount bankAccount = new BankAccount(500, 0);
     bankAccount.setHolderName("Mide");
     Assertions.assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Test that we can't withdraw below minimum")
    public void testNoWithdrawBelowMinimum(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }

    @Test
    @DisplayName("Test No Exceptions For withdraw and deposit")
    public void testWithdrawAndDepositWithoutExcceptions(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        Assertions.assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(450));
    }

    @Test
    @DisplayName("Test Speed of method")
    public void testDepositTime(){
        BankAccount bankAccount = new BankAccount(400, 0);
        Assertions.assertTimeout(Duration.ofNanos(10), () -> bankAccount.deposit(200));
    }
}

