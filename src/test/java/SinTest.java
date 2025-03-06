import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "sin", "trigonometry" })
public class SinTest extends BaseTest {

    @DataProvider(name = "sinData")
    public Object[][] data() {
        return new Object[][]{
                {0.0, 0.0},
                {Math.PI / 2, 1.0},
                {-Math.PI / 2, -1.0},
        };
    }

    @Test(dataProvider = "sinData")
    public void sin(double a, double expected) {
        Assert.assertEquals(calculator.sin(a), expected, "\nThe result is not as expected.\n");
    }
}