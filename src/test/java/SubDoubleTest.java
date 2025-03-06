import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "sub", "double", "arithmetic" })
public class SubDoubleTest extends BaseTest {

    @DataProvider(name = "subDoubleData")
    public Object[][] data() {
        return new Object[][]{
                {90.5, 0.5, 90.0},
                {-74.0, -55.5, -18.5},
                {0.0, -13.0, 13.0},
                {1000.25, 0.25, 1000.0}
        };
    }

    @Test(dataProvider = "subDoubleData")
    public void subDouble(double a, double b, double expected) {
        Assert.assertEquals(calculator.sub(a, b), expected, "\nThe result is not as expected.\n");
    }
}