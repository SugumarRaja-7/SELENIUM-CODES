// Drag And Drop The Element
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.interactions.Actions;
    
public class DragAndDrop {
public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
   FirefoxDriver driver=new FirefoxDriver();
   driver.get("https://jqueryui.com/draggable/");
   driver.manage().window().maximize();
   driver.switchTo().frame(0);
 WebElement ele= driver.findElement(By.id("draggable"));

Actions builder=new Actions(driver);
int x=ele.getLocation().getX();
int y=ele.getLocation().getY();
System.out.println("X value="+x+"  --y value= "+y);

builder.dragAndDropBy(ele,300,300).perform();

}}
