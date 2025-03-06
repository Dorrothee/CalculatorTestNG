import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "sum", "double", "arithmetic" })
public class SumDoubleTest extends BaseTest {

    @DataProvider(name = "sumDoubleData")
    public Object[][] data() {
        return new Object[][]{
                {1.9, 2.1, 4.0},
                {-1.0, -2.5, -3.5},
                {100.05, 200.45, 300.5},
                {0.0, 7.0, 7.0}
        };
    }

    @Test(dataProvider = "sumDoubleData")
    public void sumDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, "\nThe result is not as expected.\n");
    }
}