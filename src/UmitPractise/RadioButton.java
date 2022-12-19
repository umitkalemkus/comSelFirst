package UmitPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" ,"resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        driver.manage().window().maximize();

        Thread.sleep(5000);


        WebElement radioButtonLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));

         boolean isEnabled =  radioButtonLabel.isEnabled();
        System.out.println(isEnabled);


        if(isEnabled)
            radioButtonLabel.click();
        System.out.println("Clicked yesRadio button");

        WebElement radioButton = driver.findElement(By.cssSelector("#yesRadio"));
        Boolean selected1 = radioButton.isSelected();
        if (selected1){
            System.out.println("yes Radio button is selected");
        }


        WebElement Selected = driver.findElement(By.cssSelector("p[class='mt-3']"));
        System.out.println(Selected.getText());


        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());


    }

    }

