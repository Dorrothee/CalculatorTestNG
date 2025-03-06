import com.epam.tat.module4.Calculator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.annotations.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BaseTest {

    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
        System.out.println("The Calculator Instance Has Been Initialized");
    }

    @AfterMethod(alwaysRun = true)
    public void screenShotResult(ITestResult result) {
        try {
            captureScreenshot(result.getMethod().getMethodName());
        } catch (AWTException | IOException e) {
            e.printStackTrace();
            System.err.println("--- Screenshot capture failed for: " + result.getMethod().getMethodName());
        }
    }

    public void captureScreenshot(String testName) throws AWTException, IOException {
        Robot robot = new Robot();
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenFullImage = robot.createScreenCapture(screenRect);

        File screenshotsDir = new File("src/test/resources/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }

        File file = new File(screenshotsDir, testName + ".png");
        ImageIO.write(screenFullImage, "PNG", file);
        System.out.println("-- Screenshot taken for test: " + testName);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("The Calculation Has Been Completed");
    }

    @BeforeGroups(groups = "arithmetic")
    public void beforeArithmeticGroups() {
        System.out.println("\nExecute Before Group For Arithmetic methods.");
    }

    @AfterGroups(groups = "arithmetic")
    public void afterArithmeticGroups() {
        System.out.println("Execute After Group For Arithmetic methods.\n");
    }

    @BeforeGroups(groups = "algebraic")
    public void beforeAlgebraicGroups() { System.out.println("\nExecute Before Group For Algebraic methods."); }

    @AfterGroups(groups = "algebraic")
    public void afterAlgebraicGroups() { System.out.println("Execute After Group For Algebraic methods.\n"); }

    @BeforeGroups(groups = "trigonometry")
    public void beforeTrigonometryGroups() {
        System.out.println("\nExecute Before Group For Trigonometry methods.");
    }

    @AfterGroups(groups = "trigonometry")
    public void afterTrigonometryGroups() {
        System.out.println("Execute After Group For Trigonometry methods.\n");
    }

    @BeforeGroups(groups = "checkSign")
    public void beforeCheckSignGroups() {
        System.out.println("\nExecute Before Group For CheckSign methods.");
    }

    @AfterGroups(groups = "checkSign")
    public void afterCheckSignGroups() {
        System.out.println("Execute After Group For CheckSign methods.\n");
    }
}
