package Day01_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationsComments {
    public static void main(String[] args) {


        /*Invoke Chrome Browser
        Navigate to URL: https://clarusway.com/
        Navigate to URL: http://amazon.com/
        Come back to the Clarusway using the back command.
                Again go back to the amazon website using forward command
        Refresh the Browser using refresh command.
        Close the Browser.
*/

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.navigate().to("https://www.clarusway.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();







    }
}
