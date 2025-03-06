import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "double")
public class PowTest extends BaseTest {

    @DataProvider(name = "powData")
    public Object[][] data() {
        return new Object[][]{
                {-4.0, 3.0, -64.0},
                {16.0, 0.5, 4.0},
                {2.0, 2.5, 4.0},       //2^2.0 (Math.floor(2.5) = 2)
                {10.0, 0.0, 1.0},
                {3.0, -1.0, 0.333333}
        };
    }

    @Test(dataProvider = "powData")
    public void pow(double a, double b, double expected) {
        Assert.assertEquals(calculator.pow(a, b), expected, "\nThe result is not as expected.\n");
    }
}