import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "trigonometry")
public class CtgTest extends BaseTest {

    @DataProvider(name = "ctgData")
    public Object[][] data() {
        return new Object[][] {
                {Math.PI / 4, 1.0},
                {Math.PI / 2, 0.0},
                {Math.PI, -1.0},
                {-Math.PI / 4, -1.0},
        };
    }

    @Test(dataProvider = "ctgData")
    public void ctg(double a, double expected) {
        Assert.assertEquals(calculator.ctg(a), expected, "\nThe result is not as expected.\n");
    }
}
