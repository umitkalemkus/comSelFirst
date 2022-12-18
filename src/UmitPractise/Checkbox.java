package UmitPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");


        WebElement homeCheckboxCssValue = driver.findElement(By.cssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));

        homeCheckboxCssValue.click();

        homeCheckboxCssValue = driver.findElement(By.cssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));
        String HomeCheckboxClassName = homeCheckboxCssValue.getAttribute("class");

        if (HomeCheckboxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked");


        }else System.out.println("Checkbox is unchecked");




    }
}