package DaY02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {

    public static void main(String[] args) {


        // Go to the Amazon URL: https://www.amazon.com/
        // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // Amazon sitesini ziyaret ettik
        driver.get("https://www.amazon.com/");

        //Page source u kaynagi  aldik

       String pageSource = driver.getPageSource();

       //Page source testimizi yapiyoruz...!

        System.out.println("Page source testi yapiliyor");

        if (pageSource.contains("java")){
            System.out.println("Page source testi PASSED");
        }else
            System.out.println("Page source testi FAILED");















    }
}
