import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class dem{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lenovo/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        String before="//*[@id='customers']/tbody/tr[";
        String after="]/td[1]";
        for(int i=2;i<=7;i++){
            String xxpath=before+i+after;
            WebElement element= driver.findElement(By.xpath(xxpath));
            System.out.println(element.gettext());
        }
    }
    
    
}