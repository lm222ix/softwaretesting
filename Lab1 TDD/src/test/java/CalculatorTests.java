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

    @Test(expected = IllegalArgumentException.class)
    public void SumNullInputShouldThrowIllegalArgumentException() {
        c.sum(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SumEmptyInputShouldThrowIllegalArgumentException() {
        int[] arr = {};
        c.sum(arr);
    }

    // The array will be limited to something like 10 numbers, but should work for all integers.
    @Test
    public void SumShouldAccualySummarizesTheArray() {
        int[] arr = {0,0,1,2,4,-2,-1,0,0};
        Assert.assertEquals(c.sum(arr),4);
    }

}
