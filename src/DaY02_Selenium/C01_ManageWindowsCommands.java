package DaY02_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Point point = driver.manage().window().getPosition();

        int posX = point.getX();
        int PosY = point.getY();


        System.out.println("Sayfamizin x koordinati =  "+ posX);
        System.out.println("Sayfamizin y koordinati =  "+ PosY);


        Dimension dimension =driver.manage().window().getSize();

       int h = driver.manage().window().getSize().getHeight();
       int w = driver.manage().window().getSize().getWidth();
        System.out.println("Browser imizin yuksekligi ="+ h);
        System.out.println("Browser imizin  genisligi  ="+ w);

        driver.manage().window().minimize();

       // 5 saniye bekliyoruz
       Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.quit();






    }






}
