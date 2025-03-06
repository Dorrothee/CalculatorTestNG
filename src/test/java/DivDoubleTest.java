import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = { "div", "double" })
public class DivDoubleTest extends BaseTest {

    @DataProvider(name = "divDoubleValidData")
    public static Object[][] validData() {
        return new Object[][] {
                {77.0, 10.0, 7.7},
                {-58.88, 9.2, -6.4},
                {-1166.77, -1166.77, 1.0},
                {0.0, 100000.78, 0.0}
        };
    }

    @DataProvider(name = "invalid")
    public static Object[][] divDoubleInvalidData() {
        return new Object[][] {
                {77.0, 0.0},
                {-58.88, 0,},
                {0.0, 0.0}
        };
    }

    @Test(dataProvider = "divDoubleValidData")
    public void divDoubleValid(double a, double b, double expected) {
        Assert.assertEquals(calculator.div(a,b), expected, "\nThe result is not as expected.\n");
    }

    @Test(dataProvider = "divDoubleInvalidData")
    public void divDoubleInvalid(double a, double b) {
        double result = calculator.div(a, b);
        if (a == 0.0 && b == 0.0) {
            assertEquals(result, Double.NaN, "\nExpected NaN but got " + result + "\n");
        } else if (a > 0.0 && b == 0.0) {
            assertEquals(result, Double.POSITIVE_INFINITY, "\nExpected Positive Infinity but got " + result + "\n");
        } else if (a < 0.0 && b == 0.0) {
            assertEquals(result, Double.NEGATIVE_INFINITY, "\nExpected Negative Infinity but got " + result + "\n");
        }
    }
}
