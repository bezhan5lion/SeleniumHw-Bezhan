import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class MultiselectDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");
        driver.manage().window().maximize();
//  1. Select List Demo:
//   - Use the **Select** class to select the option **"Pear"** from the dropdown.
//   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
//   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.
        WebElement DD=driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel=new Select(DD);
        sel.selectByValue("Pear");
        List<WebElement>options=sel.getOptions();
        for (WebElement opt:options){
            System.out.println(opt.getText());
        }
//2. Select Multiple Options:
//   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
      WebElement multiSelectDD=driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel2=new Select(multiSelectDD);
        Boolean checkMultipleSelect=sel2.isMultiple();
        if (checkMultipleSelect){
        sel2.selectByValue("Traveling");
        sel2.selectByVisibleText("Cooking");
        sel2.selectByIndex(4);
        }
        WebElement getAllSelected=driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllSelected.click();

        Thread.sleep(5000);

        WebElement result = driver.findElement(By.xpath("//p[contains(text(),'Options selected are : ')]"));
        System.out.println(result.getText());

        sel2.deselectByValue("Traveling");

        System.out.println(result.getText());

//   - Using the **Select** class, make the following selections:
//     - **Traveling**
//     - **Cooking**
//     - **Gardening**
//   - Click the **"Get All Selected"** button and print the result on the console.
//   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
//   - Click the **"Get All Selected"** button again and print the result on the console.

    }
}
