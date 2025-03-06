import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @DataProvider(name = "isNegativeData")
    public static Object[][] data() {
        return new Object[][]{
                {0L, false},
                {100L, false},
                {-357L, true},
                {Long.MAX_VALUE, false},
                {Long.MIN_VALUE, true},
        };
    }

    @Test(dataProvider = "isNegativeData")
    public void testIsNegative(long val, boolean expected) {
        boolean isNegative = calculator.isNegative(val);
        Assert.assertEquals(isNegative, expected, "\nThe result is not as expected.\n");
    }
}