// Explicit Wait
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
                System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // invisibility
        driver.get("https://letcode.in/signin");
        driver.findElement(By.name("email")).sendKeys("sugumar3730@gmail.com");
        driver.findElement(By.name("password")).sendKeys("sugumarstar");
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        WebElement toast= driver.findElement(By.id("toast-container"));
        wait.until(ExpectedConditions.visibilityOf(toast));
        System.out.println(toast.getText());
        wait.until(ExpectedConditions.invisibilityOf(toast));
        driver.findElement(By.linkText("Sign out")).click();
        System.out.println("Program Ended");

}}
// wait for Alert
    /* driver.get("https://letcode.in/waits");
        driver.findElement(By.id("accept")).click();  
    Alert until= wait.until(ExpectedConditions.alertIsPresent()); 
      System.out.println("Alert Text is ="+until.getText());
        until.accept();
        driver.switchTo().alert().accept();  */                  


