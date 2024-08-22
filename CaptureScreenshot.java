import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
    public static void main(String[] args) throws Exception {
                  System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/buttons");
 File firstsrc=driver.getFullPageScreenshotAs(OutputType.FILE);
 File dest=new File("./snap/iimg.png");
 FileHandler.copy(firstsrc, dest);
 //get element screenshot
 WebElement ele=driver.findElement(By.id("home"));
 File elesrc=ele.getScreenshotAs(OutputType.FILE);
 File eledest=new File("./snap/img1.png");
 FileHandler.copy(elesrc, eledest);
//  get section screenshot
WebElement info=driver.findElement(By.className("card-content"));
 File elesrcc=info.getScreenshotAs(OutputType.FILE);
 File eledestt=new File("./snap/imgg2.png");
 FileHandler.copy(elesrcc, eledestt);
 driver.quit();
    }
}
