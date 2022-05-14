package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args){
        // 1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/deniztaskin/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver(); // Instantiate a Chrome Browser

        // 2.Maximize driver
        driver.manage().window().maximize(); // Maximize the driver

        // 3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // 4. Navigate to Google website
        driver.get("https://www.google.com/");

        // 5. Validate the title as Google
        System.out.println("The title of the page = " + driver.getTitle());
        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        // 6. Quit the driver
        driver.quit();


        System.out.println("End of the program!");

    }
}
