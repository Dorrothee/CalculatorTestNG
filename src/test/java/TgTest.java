import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = "trigonometry")
public class TgTest extends BaseTest {

    @DataProvider(name = "tgData")
    public Object[][] data() {
        return new Object[][]{
                {Math.PI / 4, 1.0},
                {Math.PI, 1.0},
                {-Math.PI / 4, 1.0},
        };
    }

    @Test(dataProvider = "tgData")
    public void tg(double a, double expected) {
        Assert.assertEquals(calculator.tg(a), expected, "\nThe result is not as expected.\n");
    }
}