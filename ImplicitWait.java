// ImplicitWait
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
    public static void main(String[] args) {
                   System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in");
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.findElement(By.linkText("Log in")).click(); 
 driver.findElement(By.name("email")).sendKeys("sugumar3730@gmail.com");
 driver.findElement(By.name("password")).sendKeys("sugumar3730");

    }

}
