import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        driver.manage().window().maximize();

// 1. The user is able to enter their hobbies using XPath.
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Chess, Soccer & Coding");
//2. When the user clicks the "Click Here" button using XPath.
//   Then the message `"Button clicked:"` should be displayed on the screen.
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
//3. The user successfully enters their favorite movie using XPath to find the text boxes.
        WebElement moveis = driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
        moveis.sendKeys("Jason Burn, Troy, Joker");
//4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
        WebElement paragraph = driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]"));
        String p1=paragraph.getText();
        System.out.println(p1);
//5. The user is able to enter the city in the designated field.
        WebElement city = driver.findElement(By.xpath("//input[@class='form-control' and @id='yourCity']"));
        city.sendKeys("Alexandria, VA");
//6. The user must use the **indexing technique** learned in class to enter  email addresses.
        WebElement personalEmail = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        personalEmail.sendKeys("abc123@gmail.com");

        WebElement officeEmail = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        officeEmail.sendKeys("abc123@gmail.com");

        WebElement professionalEmail = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        professionalEmail.sendKeys("abc123@gmail.com");

//7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName']"));
        clientName.sendKeys("Syntax");

        WebElement clientID = driver.findElement(By.xpath("//input[@id='clientId']"));
        clientID.sendKeys("00112233");
//8. The user can use **any XPath technique** to enter the street number and house number.
        WebElement streetName = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetName.sendKeys("Russell Blvd");

        WebElement houseNumber = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumber.sendKeys("101");

    }
}
