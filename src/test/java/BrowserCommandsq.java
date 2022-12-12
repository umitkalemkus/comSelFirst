import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String pageTitle = driver.getTitle();

        String currentUrl = driver.getCurrentUrl();

        System.out.println("pageTitle = " + pageTitle);
        System.out.println("currentUrl = " + currentUrl);


        driver.quit();


    }
}
