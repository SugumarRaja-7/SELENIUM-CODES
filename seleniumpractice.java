import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumpractice {
    public static void main(String []args){
System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/edit");

//  Enter your full name
 driver.findElement(By.id("fullName")).sendKeys("sugumar");

//  Append a text and press keyboard Tap
 driver.findElement(By.id("join")).sendKeys(" person",Keys.TAB);

 //  what is inside of a box
String myvalue= driver.findElement(By.id("getMe")).getAttribute("value");
System.out.println(myvalue);

// clear the text
driver.findElement(By.id("clearMe")).clear();

// confirm edit field i disabled
boolean isedit= driver.findElement(By.id("noEdit")).isEnabled();
System.out.println(isedit);

// confirm text is read only
 String isreadonly=driver.findElement(By.id("dontwrite")).getAttribute("value");
 System.out.println(isreadonly);

//  quit browser
driver.quit();
    }

}
