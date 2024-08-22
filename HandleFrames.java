// Frame Handling
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {
public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
   FirefoxDriver driver=new FirefoxDriver();
   driver.get("https://jqueryui.com/droppable/");
   driver.manage().window().maximize();
   driver.switchTo().frame(0);
 WebElement source= driver.findElement(By.id("draggable"));   
 WebElement target= driver.findElement(By.id("droppable"));
Actions builder=new Actions(driver);
builder.dragAndDrop(source, target).perform();
   
}
}
 