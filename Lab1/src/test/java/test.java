import static org.junit.Assert.*;
import org.junit.*;


/**
 * Created by Ludde on 2015-11-05.
 */
public class test {

    static testClass testInstance;

    @BeforeClass
    public static void SetUp() {
        testInstance = new testClass();
        System.out.println("before");
    }

    @Before
    public void beforeTest() {
        System.out.println("Running test:");
    }
    @Test
    public void testAssertTrue() {
        Assert.assertTrue(true);
        System.out.println("truetest");
    }
    @Test
    public void testAssertInstanceNotNull() {
        Assert.assertNotNull(this.testInstance);
        System.out.println("instancetest");
    }
    @Test
    public void testGetMessage() {
        Assert.assertEquals("Hello World!", testInstance.getMsg());
        System.out.println("Messagetest");
    }
}
