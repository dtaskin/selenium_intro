package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {

        /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the URL of the page is displayed as "https://www.apple.com/"

        NOTE:
        driver.getCurrentUrl(); // this line returns the URL of the current page as a String
         */
        WebDriver driver = Driver.getDriver();
//        System.setProperty("webdriver.chrome.driver", "/Users/deniztaskin/IdeaProjects/selenium_intro/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        System.out.println("The URL if the page is = " + driver.getCurrentUrl());
        if(driver.getCurrentUrl().equals("https://www.apple.com/")){
            System.out.println("Apple URL verification is PASSED!!!");
        }else
            System.out.println("Apple URL verification is FAILED!!!");

        Driver.quitDriver();
//        driver.quit();
    }
}
