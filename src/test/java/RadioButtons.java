import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

//     1. Choose Your Favorite Beverage:
//   - Select the Juice radio button from the list of favorite beverages.
        WebElement beverage =driver.findElement(By.xpath("//input[@name='beverage' and @value='Juice']"));
        beverage.click();
//2. Preferred Working Environment:
//   - Retrieve all radio buttons in the Preferred Working Environment section.
//   - Traverse through the list of radio buttons in code and select the Hybrid option.
        List<WebElement> wE=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement x :wE){
            if(x.getAttribute("value").equals("hybrid")){
                Thread.sleep(2500);
                x.click();
            }
        }
//3. Choose Your Favorite Season:
//   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
        WebElement enableButton=driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
        enableButton.click();
//   - Ensure that the Spring option is now enabled, then select it.
        WebElement springButton=driver.findElement(By.xpath("//input[@name='season' and @value='spring']"));
        System.out.println(springButton.isEnabled());
//   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
        WebElement wrhs=driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        wrhs.click();
        Thread.sleep(2900);
//   - Verify that the Winter option is displayed after clicking and is available for selection.
        WebElement winterButton=driver.findElement(By.xpath("//input[@name='season' and @value='winter']"));
        System.out.println(winterButton.isEnabled());winterButton.click();
//4. Choose Your Favorite Meal:
//   - Select the Lunch radio button from the list of favorite meals.
        List<WebElement> meals=driver.findElements(By.xpath("//input[@name='meal']"));
        for (WebElement lunch:meals){
            if (lunch.getAttribute("value").equals("lunch")){
                lunch.click();
            }
        }

    }
}
