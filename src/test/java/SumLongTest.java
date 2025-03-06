import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = {"sum", "long"})
public class SumLongTest extends BaseTest {

    @DataProvider(name = "sumLongData")
    public Object[][] data() {
        return new Object[][]{
                {1, 2, 3},
                {-1, -2, -3},
                {100, 200, 300},
                {0, 7, 7}
        };
    }

    @Test(dataProvider = "sumLongData")
    public void sumLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sum(a, b), expected, "\nThe result is not as expected.\n");
    }
}