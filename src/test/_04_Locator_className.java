package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_className {

    public static void main(String[] args) {
        /*
        TEST CASE:
        1. Go to https://www.google.com/
        2. Validate the Google Image is displayed on the top of the search input box
         */

        // 1. Set driver
        WebDriver driver = Driver.getDriver();

        // 2. Validation

        driver.get("https://www.google.com/");

        // MAke sure that image is displayed

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if(googleImage.isDisplayed()) System.out.println("Google image validation is PASSED!");
        else System.out.println("Google image validation is FAILED!!!");

        // 3. Teardown

        Driver.quitDriver();
    }

}
