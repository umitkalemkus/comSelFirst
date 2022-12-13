package Day01_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");




    }

}
