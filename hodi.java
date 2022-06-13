import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws
            InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hothaifa\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        Thread.sleep(3000);
        driver.get("http://amazon.com");
        Thread.sleep(3000);



        WebElement name = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        name.click();
        name.sendKeys("coffee mug");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();

        


        Thread.sleep(30000);

        driver.quit();//Close the browser and ChromeDriver

    }
}
