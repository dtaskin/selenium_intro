package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigations {
    /*
    Go to https://www.techglobalschool.com
    Refresh the page
    Navigate to https://www.amazon.com/
    Navigate back to TechGlobal web site
    Navigate forward Amazon web site
    Validate the URL of the page
    Validate the title of the page


    EXPECTED RESULT:
    URL  = https://www.amazon.com/
    Title = Amazon.com. Spend less. Smile more.

     */


    public static void main(String[] args) throws InterruptedException {
        //1. Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/deniztaskin/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //2. Validation
        driver.get("https://www.techglobalschool.com"); // have some implicit wait for web elements to be loaded
        driver.navigate().refresh(); // this line is used to refresh the current page


        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com/");  // this line is used to navigate a particular page
                                                                // is caching your browser history and might be more useful if  we want to keep history
        Thread.sleep(1000);
        driver.navigate().back(); //this line is used to navigate back to previous page
        Thread.sleep(1000);
        driver.navigate().forward();  // this line is used to navigate forward to previously visited page

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedURL = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualURL = driver.getCurrentUrl();

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        if (actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED!!!");

        //3. Quit driver
        Thread.sleep(3000);
        driver.quit();
    }
}