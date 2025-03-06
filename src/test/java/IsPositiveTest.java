import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @DataProvider(name = "isPositiveData")
    public static Object[][] data() {
        return new Object[][]{
                {0L, false},
                {100L, true},
                {-357L, false},
                {Long.MAX_VALUE, true},
                {Long.MIN_VALUE, false},
        };
    }

    @Test(dataProvider = "isPositiveData")
    public void testIsPositive(long val, boolean expected) {
        boolean isPositive = calculator.isPositive(val);
        Assert.assertEquals(isPositive, expected, "\nThe result is not as expected.\n");
    }
}