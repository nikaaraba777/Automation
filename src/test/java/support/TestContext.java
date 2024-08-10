package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {
    private static WebDriver driver=new ChromeDriver();
    public static WebDriver getDriver(){

        return driver;
    }
    public static void teardown(){

        driver.quit();
    }
}
