import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "ctg", "trigonometry" })
public class CtgTest extends BaseTest {

    @DataProvider(name = "ctgData")
    public Object[][] data() {
        return new Object[][] {
                {0, 0.0},
                {1, 0.76},
                {2.5, 0.99},
                {4, 1.0},
        };
    }

    @Test(dataProvider = "ctgData")
    public void ctg(double a, double expected) {
        Assert.assertEquals(calculator.ctg(a), expected, 1e-2, "\nThe result is not as expected.\n");
    }
}
