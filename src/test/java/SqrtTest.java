import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "sqrt", "double", "algebraic" })
public class SqrtTest extends BaseTest {

    @DataProvider(name = "sqrtData")
    public Object[][] data() {
        return new Object[][]{
                {9.0, 3.0},
                {0.0, 0.0},
                {-121, 11},
                {2.25, 1.5},
                {1.0, 1.0}
        };
    }

    @Test(dataProvider = "sqrtData")
    public void sqrt(double a, double expected) {
        Assert.assertEquals(calculator.sqrt(a), expected, "\nThe result is not as expected.\n");
    }
}