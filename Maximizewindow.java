//  Maximizewindow
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximizewindow {
    public static void main(String[] args) {
           System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in");
  Options opt=driver.manage();
   Window win=opt.window();
   win.maximize();
    
}


    
}