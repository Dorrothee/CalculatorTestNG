import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "mult", "double", "arithmetic" })
public class MultDoubleTest extends BaseTest {

    @DataProvider(name = "multDoubleData")
    public static Object[][] data() {
        return new Object[][] {
                {2.5, 3.0, 7.0},
                {-5.5, 4.2, -24.0},
                {0.0, 100.1, 0.0},
                {-3.2, -2.5, 8.0}
        };
    }

    @Test(dataProvider = "multDoubleData")
    public void multDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.mult(a,b), expected, "\nThe result is not as expected.\n");
    }
}
