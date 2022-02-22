import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Bank Account Class")
public class BankAccountTest {

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
}
