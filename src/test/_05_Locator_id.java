package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {

        /*
        Go to https://www.techglobalschool.com

        Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */

        WebDriver driver = Driver.getDriver();

        driver .get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("The logo validation is FAILED!!!");


        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));
        if(name.isDisplayed() && name.getText().equals("TechGlobal")) System.out.println("The name validation PASSED");
        else System.out.println("The name validation is FAILED!!!");

        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));
        if(quote.isDisplayed() && quote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("The quote validation PASSED");
        else System.out.println("The quote validation is FAILED!!!");


        Driver.quitDriver();



    }
}
