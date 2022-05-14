package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the title of the page is displayed as "Apple"
         */

        System.setProperty("webdriver.chrome.driver", "/Users/deniztaskin/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        System.out.println("The title of the page = " + driver.getTitle());
        if(driver.getTitle().equals("Apple")) {
            System.out.println("Apple title verification PASSED!!!");
        }else System.out.println("Apple title verification FAILED!!!");

        driver.quit();

    }
}
