import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextAndGetAttribute {
public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
     FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/edit");
 //Get Text
  WebElement header=driver.findElement(By.tagName("h1"));
  System.out.println("TEXT1= "+header.getText());
  WebElement gettext=driver.findElement(By.xpath("//div[@class='card-content']"));
  System.out.println("TEXT2= "+gettext.getText());
  WebElement gettext2=driver.findElement(By.xpath("//input[@id='fullName']"));
  System.out.println("TEXT3= "+gettext2.getText());
// Get Attribute
WebElement getat=driver.findElement(By.xpath("//a[.='Sign up']"));
String getatt1=getat.getAttribute("class");
System.out.println("Getatt= "+getatt1);
 
}
}
