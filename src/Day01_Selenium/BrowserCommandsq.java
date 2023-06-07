package Day01_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommandsq {

 /*    Create main method
 Set Path
 Create chrome driver
 Open google home page: https://www.google.com
             Get Title on page
 Get Current URL on page
 Close/Quit the browser
*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co); // Webdriver interfacedir.
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Sampiyon Galatasaray");
        driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
        String pageTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("pageTitle = " + pageTitle);
        System.out.println("currentUrl = " + currentUrl);






      //  driver.quit();


    }
}
