package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static support.TestContext.getDriver;
import static support.TestContext.teardown;

public class Stepdefs {

    @Given("I navigate to web page")
    public void i_navigate_to_web_page() {
        getDriver().get("https://www.google.com");
    }

    @When("I click on search")
    public void i_click_on_search() {
        getDriver().findElement(By.name("q")).click();
    }

    @Given("I navigate to web page {string}")
    public void iNavigateToWebPage(String arg0) {
        getDriver().get(arg0);
    }

    @When("I click on search bar")
    public void iClickOnSearchBar() {
//        getDriver().findElement(By.id("searchbox_input")).click();
        WebElement ele=getDriver().findElement(By.id("searchbox_input"));
        ele.sendKeys("yahooaaa Duck Duck Goo");
        WebElement submit=getDriver().findElement(By.xpath("//button[@type='submit']"));
        submit.click();
    }



    @Then("I wait {int} seconds")
    public void iWaitSeconds(int sec) throws InterruptedException {
        Thread.sleep(10000*sec);
    }

    @When("I click element {int} times")
    public void iClickElementTimes(int count) {
       WebElement ele= getDriver().findElement(By.xpath("//button[@onclick='addElement()']"));
       for(int i=1;i<=count;i++){
           ele.click();


       }

    }

    @When("I remove added elements")
    public void iRemoveAddedElements() {

        List<WebElement> allElements=getDriver().findElements(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println(allElements.size());
        for(WebElement ele:allElements){
            ele.click();

        }



    }

    @When("I click on element called baz")
    public void iClickOnElementCalledBaz() {
        try {
            getDriver().findElement(By.xpath("//a[@id='41e59570-349a-013d-4f58-2e87a5da0bf6']")).click();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Test failed");
        }

        }

    @When("I inpect canvas")
    public void iInpectCanvas() {
        WebElement ele=getDriver().findElement(By.id("canvas"));
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'",ele);
        WebElement s=getDriver().findElement(By.xpath("//td[contains(text(),'Phaedrum1')]"));
        //td[contains(text(),'Phaedrum1')]
        js.executeScript("arguments[0].style.border='3px solid red'",s);

    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        getDriver().get(url);
    }

    @When("I click on checkbox{int}")
    public void iClickOnCheckbox(int num) {
     List<WebElement>ele=getDriver().findElements(By.xpath("//input[@type='checkbox']"));
     ele.get(num-1).click();

    }


    @When("I click on the element")
    public void iClickOnTheElement() {

       WebElement ele= getDriver().findElement(By.xpath("//a[contains(@href,'/users/1')]"));
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()",ele);
    }

    @When("I go back")
    public void iGoBack() {
        getDriver().navigate().back();
    }
}
