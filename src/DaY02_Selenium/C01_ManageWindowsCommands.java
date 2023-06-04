package DaY02_Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class C01_ManageWindowsCommands {
    //        Invoke Chrome Browser
//        Open URL: https://www.google.com/
//        Maximize the window.
//        Print the position and size of the page.
//        Minimize the page.
//        Wait 5 seconds in the icon state and maximize the page.
//                Print the position and dimensions of the page in maximized state.
//        Make the page fullscreen.
//        Close the Browser.


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        driver.manage().window().maximize();
        Point point = driver.manage().window().getPosition();
        int posX = point.getX();
        int PosY = point.getY();
        System.out.println("Sayfamizin x koordinati =  "+ posX);
        System.out.println("Sayfamizin y koordinati =  "+ PosY);
        Dimension dimension =driver.manage().window().getSize();

       int h = driver.manage().window().getSize().getHeight();
       int w = driver.manage().window().getSize().getWidth();
       int k =driver.manage().window().getSize().hashCode();
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("umitkalemkus");


        System.out.println("Browser imizin yuksekligi ="+ h);
        System.out.println("Browser imizin  genisligi  ="+ w);
        System.out.println("Browser imizin  hashcode  ="+ k);

        driver.manage().window().minimize();

       // 5 saniye bekliyoruz
       Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.quit();






    }






}
