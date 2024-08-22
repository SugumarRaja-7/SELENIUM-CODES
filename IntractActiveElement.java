//Name:Sugumar Raja
// Interact with Active Element
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IntractActiveElement {
  public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
 WebElement activeElement=driver.switchTo().activeElement();
activeElement.sendKeys("sugumar",Keys.TAB,"RAja",Keys.ENTER);
}}
