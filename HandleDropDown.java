// sugumar Raja
// Handle Drop Down 
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
    public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
 FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in/dropdowns");
//  selected By VisibleText
  WebElement fruits= driver.findElement(By.cssSelector("#fruits"));
  Select myfruit=new Select(fruits);
  myfruit.selectByVisibleText("Apple");
   WebElement Text=myfruit.getFirstSelectedOption();
   String FruitText=Text.getText();
   System.out.println("Text of Fruit = "+FruitText);
//    selected By Value
WebElement country=driver.findElement(By.id("country"));
Select mycountry=new Select(country);
mycountry.selectByValue("India");
WebElement con=mycountry.getFirstSelectedOption();
String context=con.getText();
System.out.println("Text of country = "+context);
 List<WebElement> conop=mycountry.getOptions();
conop.forEach(i->System.out.println("country options = "+i.getText()));
//  Selected Multiple Options
WebElement hero=driver.findElement(By.id("superheros"));
Select myheros=new Select(hero);
boolean x=myheros.isMultiple();
System.out.println("myheros is Multiple "+x);
myheros.selectByIndex(0);
myheros.selectByValue("aq");
myheros.deselectByIndex(0);
}
}