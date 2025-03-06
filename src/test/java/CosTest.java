import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "trigonometry")
public class CosTest extends BaseTest {

    @DataProvider(name = "cosData")
    public Object[][] data() {
        return new Object[][] {
                {0.0, 1.0},
                {Math.PI / 2, 0.0},
                {Math.PI, -1.0},
                {-Math.PI / 2, 0.0},
        };
    }

    @Test(dataProvider = "cosData")
    public void cos(double a, double expected) {
        Assert.assertEquals(calculator.cos(a), expected, "\nThe result is not as expected.\n");
    }
}
