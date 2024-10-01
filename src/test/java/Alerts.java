import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

//        1. Birthday Reminder:
//   - Click on the "Birthday Reminder" button.
//   - When the alert appears, accept the alert.
        WebElement birthdayReminder = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayReminder.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1500);
        alert.accept();
        //2. Delete Confirmation:
//   - Click on the **"Delete File"** button.
//   - When the confirmation alert appears, **dismiss** the alert.
//   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.
        WebElement deleteFile = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFile.click();
        Alert confimationAlert = driver.switchTo().alert();
        Thread.sleep(1500);
       confimationAlert.dismiss();
        WebElement status = driver.findElement(By.xpath("//p[contains(text(),'You pressed Cancel!')]"));
        System.out.println(status.getText());
        //3. Name Collection:
//   - Click on the **"Enter Your Name"** button.
//   - Accept the alert and provide a name.
//   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.
        WebElement yourNmae = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        yourNmae.click();
        Alert collection = driver.switchTo().alert();
        collection.sendKeys("John Wick");Thread.sleep(1500);collection.accept();
        WebElement result = driver.findElement(By.xpath("//p[contains(text(),'You have entered')]"));
        System.out.println(result.getText());
    }
}
