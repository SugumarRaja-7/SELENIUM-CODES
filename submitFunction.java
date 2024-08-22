//Submit Function
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class submitFunction {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://letcode.in");
driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sugumar3730@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sugumarstar");
driver.findElement(By.xpath("//button[.='LOGIN']")).submit();


}}
