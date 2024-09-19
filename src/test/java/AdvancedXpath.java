import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        driver.manage().window().maximize();

// 1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath (such as `parent`, `following-sibling`, or `preceding-sibling`).
    WebElement leastFavoriteBook=driver.findElement(By.xpath("//input[@id='least-favorite']"));
    leastFavoriteBook.sendKeys("The gril on the train");

    WebElement leastFavoriteBook2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
    leastFavoriteBook2.sendKeys("Planet of the Apes");

    WebElement mostFavoriteBook=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
    mostFavoriteBook.sendKeys("In the pursuit of money");
//2. The user should enter the name of their favorite book using advanced Xpath.
    WebElement favoriteBook1=driver.findElement(By.xpath("//input[@id='favouriteBook']"));
    favoriteBook1.sendKeys("In the pursuit of money");

    WebElement favoriteBook2=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
    favoriteBook2.sendKeys("Planet of the Apes");

    WebElement favoriteBook3=driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
    favoriteBook3.sendKeys("The gril on the train");
//3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
    WebElement childClassfield=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
    childClassfield.sendKeys("This is a field of child class");

    WebElement parentClassfield=driver.findElement(By.xpath("/div[@id='familyTree']/child::input[2]"));
    parentClassfield.sendKeys("div ID is the parent class");

    WebElement grantClassfield=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
    grantClassfield.sendKeys("From frm is the grant parent");
//4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath expressions.
    }
}
