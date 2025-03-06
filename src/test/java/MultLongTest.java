import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "mult", "long" })
public class MultLongTest extends BaseTest {

    @DataProvider(name = "multLongData")
    public static Object[][] data() {
        return new Object[][] {
                {2, 3, 6},
                {-5, 4, -20},
                {0, 100, 0},
                {-3, -3, 9}
        };
    }

    @Test(dataProvider = "multLongData")
    public void multLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected, "\nThe result is not as expected.\n");
    }
}
