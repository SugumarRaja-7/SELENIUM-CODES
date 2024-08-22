// topic-Find the Multiple Elements ....//Sugumar
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
    public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
// Find The Elements
driver.get("https://letcode.in/edit");
 List<WebElement> labels=driver.findElements(By.tagName("label"));
 for(WebElement label:labels){
    System.out.println("label="+label.getText());
 }
//  Find Last Element
 WebElement lastelement=labels.getLast();
 System.out.println("Last Element is "+lastelement.getText());
 driver.quit();
 

    }

}
