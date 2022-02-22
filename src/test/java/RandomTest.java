import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class RandomTest {

    Random random = new Random();


    @Test
    public void testUppercase(){
        Assertions.assertEquals("BISI", random.upperCase());

    }

    @Test
    public void testEven(){
        Assertions.assertEquals(true, random.even(4000));

    }

}
