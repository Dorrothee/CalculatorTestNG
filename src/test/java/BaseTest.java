import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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

}
