// Navigation commands
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigationCommands {
    public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/buttons");
String url=driver.getCurrentUrl();
System.out.println("Button url"+url);
driver.findElement(By.id("home")).click();
String homeurl=driver.getCurrentUrl();
System.out.println("homeurl"+homeurl);
driver.navigate().back();
System.out.println("return to back button"+driver.getCurrentUrl());
driver.navigate().refresh();
driver.navigate().to("https://letcode.in/signin");
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
System.out.println("After forward"+driver.getCurrentUrl());
    }

}
