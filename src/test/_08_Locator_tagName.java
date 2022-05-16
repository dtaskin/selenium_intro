package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Validate the WIKIPEDIA heading1 is displayed
        Validate the WIKIPEDIA LOGO is displayed
        Validate the search input box is displayed
        Validate the search button is displayed
        Validate the search button is enabled
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1"));
//        WebElement heading1 = driver.findElement(By.xpath("//h1"));

//        WebElement logo = driver.findElement(By.className("central-featured-logo"));
        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo"));

        WebElement searchInput = driver.findElement(By.id("searchInput"));
//        WebElement searchInput = driver.findElement(By.cssSelector("#searchInput"));

        WebElement searchButton = driver.findElement(By.className("pure-button"));
//        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));
//        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button-primary-progressive"));

        System.out.println(heading1.isDisplayed());//true
        System.out.println(heading1.getText());//
        System.out.println(logo.isDisplayed()); // true
        System.out.println(searchInput.isDisplayed()); // true
        System.out.println(searchButton.isDisplayed()); // true
        System.out.println(searchButton.isEnabled()); //true

       Driver.quitDriver();

    }
}
