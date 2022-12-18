package UmitPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {

    public static void main(String[] args) {



     System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");


        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));

        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckboxLabel  = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));

        try {
            sportCheckbox.click();

        }catch(ElementClickInterceptedException e){
            sportCheckboxLabel.click();
            System.out.println("Enter catch blok");
        }

        boolean isSelected = sportCheckbox.isSelected();
        System.out.println(isSelected);








}
}