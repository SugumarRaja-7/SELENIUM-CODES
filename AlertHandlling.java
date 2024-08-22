import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandlling {
    public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/alert");
//  simple Alert
 driver.findElement(By.id("accept")).click();
 Alert alert= driver.switchTo().alert();
  String text=alert.getText();
  System.out.println("simple alert text"+text);
alert.accept();
// Confirm Alert
driver.findElement(By.id("confirm")).click();
Alert confirmalert= driver.switchTo().alert();
 String text1=confirmalert.getText();
 System.out.println("confirm alert text"+text1);
alert.dismiss();
// Prompt Alert
driver.findElement(By.id("prompt")).click();
Alert promptalert= driver.switchTo().alert();
promptalert.sendKeys("sugumar");
promptalert.accept();
 String promttext=driver.findElement(By.id("myName")).getText();
 System.out.println("Prompt text"+promttext);
//  Notes:
// Exception:
// 1. UnhandledAlertException
// 2.NoAlertpresentException
  }
}
