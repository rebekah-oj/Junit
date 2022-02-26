import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountAssumptionsTest {

    @Test
    @DisplayName("Test Activation After Creation")
  public void testActive(){
      BankAccount bankAccount = new BankAccount(500, 0);
        Assertions.assumeTrue(bankAccount != null);
        Assertions.assumeThat(bankAccount != null, ()-> bankAccount.isActive());
  }
}
