package tests

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

class BaseTest {
    protected WebDriver driver

    @BeforeMethod
    void setUp() {
        driver = new ChromeDriver()
        driver.manage().window().maximize()
    }

    @AfterMethod
    void tearDown() {
        if (driver != null) {
            driver.quit()
        }
    }
}