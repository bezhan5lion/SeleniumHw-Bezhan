import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");
        driver.manage().window().maximize();

        WebElement userID=driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("777");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("JohnWick");

        WebElement lectureInto=driver.findElement(By.cssSelector("input[name^=\"LectureIntro\"]"));
        lectureInto.sendKeys("Hellooooo");

        WebElement feedBack=driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedBack.sendKeys("Selenium is Fun");

        WebElement feedBackofDucky=driver.findElement(By.cssSelector("input[id*='FeedbackfromDucky']"));
        feedBackofDucky.sendKeys("Selenium is Easy");

        WebElement clintID=driver.findElement(By.cssSelector("input[name*='ClientID']"));
        clintID.sendKeys("123456789");

        WebElement email=driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("info@syntax.com");

        WebElement topic=driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        topic.sendKeys("CCS Selector");
    }
}
