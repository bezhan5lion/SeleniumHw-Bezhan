import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        1. **Button Click and Checkbox Selection**:
//   - Click on the button labeled **"Click me"**.
//   - Use an appropriate wait method to wait until the checkbox options appear.
//   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
    driver.findElement(By.id("show_text_synchronize_three")).click();
    driver.findElement(By.xpath("//input[@type='checkbox' and @value='Option-1']")).click();
    driver.findElement(By.xpath("//input[@type='checkbox' and @value='Option-2']")).click();

    }
}
