// Right click 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
           System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
       FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://practice.expandtesting.com/context-menu");
       WebElement ele=driver.findElement(By.id("hot-spot"));
       Actions builder=new Actions(driver);
       builder.contextClick(ele).perform();
        Alert alt=driver.switchTo().alert();
        System.out.println("Alert Text="+alt.getText());
        alt.accept();
    }
}
