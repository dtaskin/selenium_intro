import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Self_Practice {
    public static void main(String[] args) {

        /*
        Validate Comfy Elite application title and URL
        1. Go to https://comfyelite.com/
        2. Validate the URL and the title

        Expected result
        URL = https://comfyelite.com/
        Title = COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow

         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        System.out.println("THe URL of the page is = " + driver.getCurrentUrl());
        System.out.println("The title of the page is = " + driver.getTitle());
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/") ? "The URL verification is passed" : "The URL verification is FAILED!!!");
        System.out.println(driver.getTitle().equals("COMFY ELITE - Pillow, Neck Pillow, Travel, Pillow") ? "Title verification is Passed" : "Title verification is FAILED!!!");


        System.out.println("\n------- ID Locator-------\n");

        /*
        Go to https://www.techglobalschool.com

        Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
        */

        driver.get("https://www.techglobalschool.com");

        String signature = driver.findElement(By.id("comp-kuiqjidf1")).getText();
        String companyName = driver.findElement(By.xpath("//*[@id='comp-kuiqjidf']")).getText();
        WebElement logo = driver.findElement(By.cssSelector("#img_comp-kuiqjide2"));

        System.out.println("Company signature is = " + signature);
        System.out.println(signature.equals("OUR GOAL IS YOUR SUCCESS") ? "Company signature verification is Passed" : "Company signature verification is FAILED");

        System.out.println("Company name is = " + companyName);
        System.out.println(companyName.equals("TechGlobal") ? "Company name verification is Passed":"Company name verification is FAILED");

        System.out.println(logo.isDisplayed()? "The logo is DISPLAYED" : "Logo verification is FAILED!!!");

        System.out.println("\n------- ClassName Locator ------- \n");

        /*
        TEST CASE:
        1. Go to https://www.google.com/
        2. Validate the Google Image is displayed on the top of the search input box
         */

        driver.get("https://www.google.com/");

        System.out.println(driver.findElement(By.className("lnXdpd")).isDisplayed() ? "Logo verification is PASSED" : "Logo verification is FAILED");


        Driver.quitDriver();
    }
}
