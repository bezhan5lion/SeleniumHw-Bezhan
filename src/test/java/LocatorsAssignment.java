import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Acceptance Criteria
//1. The user should fill the form using any of the locators (`id`, `name`, `tagname`, `linktext`, `partial linktext`).
//2. If the email address is not in the correct format (i.e., it doesn't contain an `@` sign), the form should not be submitted, and an error message should be displayed.
//3. When the user clicks on the "Click Here" link, a new tab should open in the browser.
//4. When the user clicks the "Submit" button, all the entered options should be displayed on the screen.

public class LocatorsAssignment {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();

        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Wick");

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("JohnWick");

        WebElement cName=driver.findElement(By.name("ClientName"));
        cName.sendKeys("Syntax");

        WebElement cID=driver.findElement(By.name("ClientId"));
        cID.sendKeys("007");

        WebElement cFeedback=driver.findElement(By.name("Clientfeedback"));
        cFeedback.sendKeys("Selenium is Fun");

        WebElement projectName=driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("3rd Home Work");

        WebElement dueDate=driver.findElement(By.id("ProjectTimeId"));
       dueDate.sendKeys("09/16/2024");

        WebElement cAddress=driver.findElement(By.name("CurrentAddress"));
        cAddress.sendKeys("Virginia");

        WebElement pAddress=driver.findElement(By.id("PermanentAddressId"));
        pAddress.sendKeys("USA");

        WebElement submitBtn=driver.findElement(By.name("btn-submit"));
        submitBtn.click();

        WebElement email2=driver.findElement(By.id("yourEmail"));
        email2.sendKeys("JohnWick@gmail.com");

        WebElement linkText=driver.findElement(By.linkText("Click Here."));
        linkText.click();

        WebElement submitBtn2=driver.findElement(By.id("btn-submit"));
        submitBtn2.click();

    }
}
