import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//    1. **Change Text**:
//   - Click on the button **"Click me to change text!"**.
//   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.
        driver.findElement(By.id("changetext_button")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement newTxt = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(newTxt.getText());
        //2. **Enable Button**:
//   - Click on the button **"Click me to enable button"**.
//   - Wait for the button to be enabled, and once it's enabled, click on it.
        driver.findElement(By.id("enable_button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-default'])[3]")));
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]")).click();
//3. **Checkbox Checked Based on Click**:
//   - Click on the button **"Click me to check the checkbox"**.
//   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
        driver.findElement(By.xpath("//button[@id='checkbox_button']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
    }
}
