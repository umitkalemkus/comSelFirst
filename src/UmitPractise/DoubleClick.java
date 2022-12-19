package UmitPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DoubleClick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrore.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        driver.manage().window().maximize();


        WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(DoubleClick).perform();


        WebElement DoubleClickMsg = driver.findElement(By.id("doubleClickMessage"));
        String message1 =DoubleClickMsg.getText();
        System.out.println(message1);












    }
}
