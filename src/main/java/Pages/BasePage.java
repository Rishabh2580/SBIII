package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentManager;




public class BasePage {

    public WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        extent = ExtentManager.getInstance("reports//Extent_demo.html");
        test = extent.startTest("Default Test");
        driver.get("https://uw-ui.sbi.ausis.ai/auth/login");
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    @AfterMethod
    public void Screenshot(ITestResult result) throws IOException {
        if (test == null) {
            test = extent.startTest("Default Test");
        }

        if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(LogStatus.PASS, "Test case got passed");
        } else if (result.getStatus() == ITestResult.FAILURE) {
            // Take screenshot
            captureScreenshot(result.getName());

            // Log more details about the failure
            String failureDetails = result.getThrowable() != null ? result.getThrowable().getMessage() : "No specific failure details";
            test.log(LogStatus.FAIL, "Test case got failed. Details: " + failureDetails);
        }
        extent.flush();
    }


    private void captureScreenshot(String methodName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "Testoutput/" + methodName + ".png";  // Relative path

        // Save the screenshot to the project directory
        FileUtils.copyFile(src, new File(screenshotPath));

        // Log screenshot path
        String relativePath = new File(screenshotPath).getAbsolutePath();
        test.log(LogStatus.FAIL, "Test case got failed. Details: " + test.addScreenCapture(relativePath));

        // Explicitly flush the report after adding the screenshot
        extent.flush();
    }




//@AfterSuite
//public void tearDown() {
//   driver.quit();
//}
}

