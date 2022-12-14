package DaY02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookURLTest {

    // Invoke Chrome Driver
// Navigate to Facebook homepage URL: https://www.facebook.com/
// Verify expected equals actual URL.
// Verify expected contains Facebook Word.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

          // URL TESTIMIZI YAPTIK
        System.out.println("URL testi yapiliyor....");

        String expectedUrl = "https://www.facebook.com/";

        String actualUrl  = driver.getCurrentUrl();


        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");

        }else
            System.out.println("URL testi FAILED");


        //Title testimizi yaptik


       String actualTitle =driver.getTitle();

       if (actualTitle.contains("Facebook")){
           System.out.println("Title testi PASSED");
       }else
           System.out.println("Title testi FAILED");


       driver.quit();







    }




}
