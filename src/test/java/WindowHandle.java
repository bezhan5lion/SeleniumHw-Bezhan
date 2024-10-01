import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

//        1. Click on Button B1:
//   - Ensure that clicking on the **B1** button opens a new window.
//   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.
        String currentUrl = driver.getCurrentUrl();
        String mainPage = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[contains(text(),'Open B1 Page ')]")).click();
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if (!url.equals(currentUrl)) {
                WebElement text = driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h2"));
                System.out.println(text.getText());
            }
        }
        Thread.sleep(2000);
        driver.switchTo().window(mainPage);
        driver.findElement(By.xpath("//a[contains(text(),'Open B2 Page ')]")).click();
        Set<String> allHandles2 = driver.getWindowHandles();

        for (String handle : allHandles2) {
            driver.switchTo().window(handle);
            String url2 = driver.getCurrentUrl();
            if (!url2.equals(currentUrl)) {
                WebElement text2 = driver.findElement(By.xpath("//div[@class='container']/h2"));
                System.out.println(text2.getText());
            }
        }
//2. Click on Button B2:
//   - Ensure that clicking on the **B2** button opens a new window.
//   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.

    }
}
