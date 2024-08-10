package support;

import io.cucumber.java.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static support.TestContext.getDriver;
import static support.TestContext.teardown;

public class Hooks {
//    public static WebDriver driver=new ChromeDriver();
    @BeforeAll
    public static void setUp(){

        getDriver();

    }
    @Before(order = 0)
    public static void scenarioStart(){
        System.out.println("Scenario starts");

    }
    @After(order = 0)
    public static void scenarioEnds(){
        System.out.println("Scenario ends");


    }


    @AfterAll
    public static void tearDown(){


      teardown();
        }

}

