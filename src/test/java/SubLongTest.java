import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "sub", "long", "arithmetic" })
public class SubLongTest extends BaseTest {

    @DataProvider(name = "subLongData")
    public Object[][] data() {
        return new Object[][]{
                {7, 3, 4},
                {-8, -6, -2},
                {0, 5, -5},
                {9, 100, -91}
        };
    }

    @Test(dataProvider = "subLongData")
    public void subLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected, "\nThe result is not as expected.\n");
    }
}