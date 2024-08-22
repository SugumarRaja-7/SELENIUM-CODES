// Sugumar Raja
// selenium -Validations
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
 driver.get("https://letcode.in");
// 1.isDisplayed() - used to check if the element is visible or rentered
WebElement login= driver.findElement(By.linkText("Log in"));
boolean displayed=login.isDisplayed();
System.out.println("Login button displayed= "+displayed);
// 2.isEnabled() - if the element is intractable
driver.get("https://letcode.in/buttons");
WebElement btn=driver.findElement(By.xpath("//button[@class='button is-info']"));
System.out.println(" button Enabled= "+btn.isEnabled());
// 3.isSelected() - if the element is already selected-(radio,checkBox)
driver.get("https://letcode.in/radio");
WebElement select=driver.findElement(By.xpath("//label[.=' Remember me ']//input[1]"));
System.out.println("is Selected= "+select.isSelected());
}}
