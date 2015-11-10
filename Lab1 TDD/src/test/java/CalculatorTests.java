import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.mockito.internal.matchers.Null;

import java.util.Random;

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
        int[] arr = {0,0,1,2,4,-2,-1,0,1};
        Assert.assertEquals(5, c.sum(arr));

        int[] arr2 = {Integer.MAX_VALUE, Integer.MIN_VALUE, 2};
        Assert.assertEquals(1, c.sum(arr2));

    }






    /*
    private int[] halfAssedRandomArray() {
        Random r = new Random();
        int[] randoms = new int[10];

        for(int i = 0; i<10; i++) {
            int j = r.nextInt();
            j = i*12345 % 99;
            randoms[i] = j;
        }
        return randoms;
    }
    */

}
