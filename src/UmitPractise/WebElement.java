package UmitPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");


        org.openqa.selenium.WebElement nameElement = driver.findElement(By.id("userName"));

        nameElement.click();
        nameElement.sendKeys("Mustafa");

        org.openqa.selenium.WebElement email =driver.findElement(By.id("userEmail"));

        email.click();
        email.sendKeys("kit233@yahoo.com");



        org.openqa.selenium.WebElement adress =driver.findElement(By.id("currentAddress"));

        adress.click();
        adress.sendKeys("91 Terrakce Road");


      org.openqa.selenium.WebElement permanentAdress =driver.findElement(By.id("permanentAddress"));
      permanentAdress.click();
      permanentAdress.sendKeys("200 high street");



      org.openqa.selenium.WebElement submit =driver.findElement(By.cssSelector("button.btn"));
      submit.click();



      org.openqa.selenium.WebElement nameText =driver.findElement(By.xpath("//*[@id='name']"));
      String name =nameText.getText();
      System.out.println(name);



















    }





}
