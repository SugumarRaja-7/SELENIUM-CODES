// Buttons Handling in selenium
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleButtons {
    public static void main(String[] args) {
          System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/buttons");
//  get X&Y co-ordinates
 WebElement ele= driver.findElement(By.id("position"));
 Point point=ele.getLocation();
 int X=point.getX();
  int Y=point.getY();
System.out.println("x=>"+X +"Y"+Y);
// Find Element colour
WebElement btncolour=driver.findElement(By.id("color"));
 String colour=btncolour.getCssValue("background-color");
 System.out.println("colour"+colour);
//  Find the Height & Width of the button
 Rectangle rect=driver.findElement(By.id("property")).getRect();
 System.out.println("width= "+rect.getWidth() +"heigth= "+rect.getHeight());
//  Quit
driver.quit();
    }

}
