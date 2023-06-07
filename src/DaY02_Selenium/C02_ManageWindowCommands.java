package DaY02_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_ManageWindowCommands {

    public static void main(String[] args) throws InterruptedException {

        // Go to the Amazon URL : https://www.amazon.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want.
// Close the page.


        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.com");

          //  browser pozisyon ve boyutunu yazdirdik
        System.out.println("Browser imizin pozisyonu ="+ driver.manage().window().getPosition());
        System.out.println("Browser imizin bouyutu ="+ driver.manage().window().getSize());


        Thread.sleep(3000);
        //browser imizin pozisyonunu (190 ,70) olarak set ettik.

        driver.manage().window().setPosition(new Point(190,80));


        // browser imizin boyutunu (300 ,500) olarak set ettik.

        int height = driver.manage().window().getSize().getHeight();
        int width =driver.manage().window().getSize().getWidth();

        System.out.println("height = " + height);
        System.out.println("width = " + width);

        System.out.println("Browzer imizin boyutu test ediliyor");

        if (width ==800 &&height== 1100){
            System.out.println("Boyut testi GECTI");

        }else System.out.println("Boyut testi KALDI");


        // browser imizin pozisyonunu   dogruluyoruz.


        int X = driver.manage().window().getPosition().getX();
        int Y = driver.manage().window().getPosition().getY();

        System.out.println("Browzer imizin pozisyonu  test ediliyor");

        if (X==190 && Y==70){
            System.out.println("Pozisyon testi GECTI");

        }else System.out.println("Pozizsyon testi KALDI");






        Thread.sleep(5000);
        driver.quit();













    }



}
