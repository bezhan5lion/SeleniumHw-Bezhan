import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrame {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

//        1. Select Age Checkbox:
//   - Select the **Age** checkbox.
    driver.switchTo().frame("dropdownIframe");
    driver.switchTo().frame(0);

    WebElement checkBox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
    checkBox.click();
//2. **Select City**:
//   - Select any city from the dropdown.
    driver.switchTo().defaultContent();
    driver.switchTo().frame(1);

    WebElement DD=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(DD);
        sel.selectByVisibleText("Dallas");
    //3. **Enter Username**:
//   -enter your username in the **Username** field.
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

    WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
    userName.sendKeys("John Wick");
    }
}
