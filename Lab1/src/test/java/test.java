import static org.junit.Assert.*;

import junit.extensions.TestSetup;
import org.junit.*;


/**
 * Created by Ludde on 2015-11-05.
 */
public class test {

    private static Calculator calc;

    @BeforeClass
    public static void TestSetup() {
        calc = new Calculator();
        System.out.println("- - - Setup - - -");
        System.out.println("Calculator instanciated");
        System.out.println();
    }

    @Before
    public void beforeTest() {
        System.out.println("- - - Test - - -");
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(5, calc.addition(2, 3));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(1, calc.subtraction(3,2));
    }
}
