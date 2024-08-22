// MouseHover Practice
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
   FirefoxDriver driver=new FirefoxDriver();
   driver.get("https://www.flipkart.com/");
   driver.manage().window().maximize();
   WebElement elec=driver.findElement(By.xpath("//span[.='Login']"));
   Actions builder=new Actions(driver);
   builder.moveToElement(elec).perform();
   driver.findElement(By.xpath("//li[.='My Profile']")).click();


}
}