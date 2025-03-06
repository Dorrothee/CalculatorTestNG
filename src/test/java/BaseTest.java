import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("The Calculator Instance Has Been Initialized");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("The Calculation Has Been Completed");
    }

    @BeforeGroups(groups = { "sum", "sub", "div", "mult" })
    public void beforeArithmeticGroups() {
        System.out.println("Execute Before Group For Arithmetic methods.");
    }

    @AfterGroups(groups = { "sum", "sub", "div", "mult" })
    public void afterArithmeticGroups() {
        System.out.println("Execute Before Group For Arithmetic methods.");
    }
}
