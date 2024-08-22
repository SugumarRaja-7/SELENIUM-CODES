import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
    public static void main(String[] args) {
                System.setProperty("webdriver.gecko.driver","./firefoxdriver/geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://letcode.in/table");
        WebElement table= driver.findElement(By.id("simpletable"));
        List<WebElement>headers=table.findElements(By.tagName("th"));
        for (WebElement header :headers) {
            System.out.println(header.getText());  
        }
      List<WebElement> allrows=table.findElements(By.cssSelector("tbody tr"));
      int size=allrows.size();
    //   for(WebElement row:allrows){
    //      List<WebElement> column=row.findElements(By.tagName("td"));
    //     WebElement firstcolumn= column.get(0);
    //     System.out.println(firstcolumn.getText());
    //   }
    for (int i=0;i<=size;i++) {
      List <WebElement> rows=allrows.get(i).findElements(By.id("td"));
    WebElement lastname=rows.get(1);
     String text=lastname.getText();
    if(text.equals("Raj")){
WebElement input=rows.get(3).findElement(By.tagName("input"));
input.click();
break;
    }
    }


}}
