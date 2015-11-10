import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.mockito.internal.matchers.Null;

/**
 * Created by Ludde on 2015-11-10.
 */
public class CalculatorTests {

    private static Calculator c;

    @BeforeClass
    public static void setUp() {
        c = new Calculator();
    }

    @Test(expected = NullPointerException.class)
    public void SummarizeNullInputTest() {
        int[] arr = {1,2,3};
        c.Sum(arr);
    }
}
