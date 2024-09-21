import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

//   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.
    WebElement subscribe=driver.findElement(By.xpath("//input[@id='newsletter']"));
    if (subscribe.isEnabled()){
        subscribe.click();
    }
//2.Select Your Hobbies:
//   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
//   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.
        List<WebElement> hobies=driver.findElements(By.xpath("//input[@class='cb-element']"));
    for (WebElement H:hobies) {
        if (H.getAttribute("id").equals("reading") || H.getAttribute("id").equals("cooking")) {
            H.click();
        }
    }
//3. Select Your Interests:
//   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
//   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.
        WebElement showCheckBoxBtn=driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            showCheckBoxBtn.click();
            Thread.sleep(2000);

        WebElement musicCheckBox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Music']"));
        musicCheckBox.click();

//4. Preferences:
//   - Verify that the **Receive Notifications** checkbox is disabled.
//   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
        WebElement preferences=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
boolean p=preferences.isEnabled();
        System.out.println(p);

        WebElement showP=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        showP.click();
        WebElement receivedNotification=driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        receivedNotification.click();

}
}
