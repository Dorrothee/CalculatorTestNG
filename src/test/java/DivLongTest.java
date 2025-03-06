import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = {"div", "long"})
public class DivLongTest extends BaseTest {

    @DataProvider(name = "divLongValidData")
    public static Object[][] validData() {
        return new Object[][] {
                {7, 1, 7},
                {-45, 5, -9},
                {-1024, -1024, 1},
                {0, 45876, 0}
        };
    }

    @DataProvider(name = "divLongInvalidData")
    public static Object[][] invalidData() {
        return new Object[][] {
                {487, 0},
                {0, 0},
                {-13121, 0},
        };
    }

    @Test(dataProvider = "divLongValidData")
    @Description("Test the division (valid data) case")
    public void divLongValid(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected, "\nThe result is not as expected.\n");
    }

    @Test(dataProvider = "divLongInvalidData", expectedExceptions = NumberFormatException.class)
    @Description("Test the division by zero (invalid data) case")
    public void divLongInvalid(long a, long b) {
        calculator.div(a, b);
    }
}