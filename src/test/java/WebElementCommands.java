import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        driver.manage().window().maximize();
//        1. Retrieve Attribute:
//   - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.
        WebElement getAtr=driver.findElement(By.xpath("//div[@id='textattr']"));
        String AtrString=getAtr.getAttribute("data-text-attr");System.out.println(AtrString);
//2. Meal Preference:
//   - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
        WebElement musicalFestival=driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']/preceding-sibling::label[2]"));
//   Ensure that the option for "Tech Talk" is disabled.
        boolean mf=musicalFestival.isEnabled();
        if (mf){
            System.out.println("The Musical Festival Checkbox is enabled");
            musicalFestival.click();
        }else {
            System.out.println("The Musical Festival Checkbox is Not enabled");
        }
//   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.
        WebElement showMore=driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        showMore.click();
        WebElement artExhibition=driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
        boolean tT=artExhibition.isEnabled();
        if (tT){
            System.out.println("The Art Exhibition button is enabled");
            artExhibition.click();
        }else {
            System.out.println("It is disabled");
        }
//3. Mystery Message:
//   - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret" and print it on the console.
    WebElement mysTeryMessage=driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String mysTery=mysTeryMessage.getAttribute("title");
        System.out.println(mysTery);
//Option Box:
//   - If "Checkbox 1" is enabled, click on it.
//   - Ensure that "Checkbox 2" is disabled.---
    WebElement optionBox1=driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
    if (optionBox1.isEnabled()){
        optionBox1.click();
    }
    WebElement optionBox2=driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        System.out.println("IS Checkbox 2 disabled? -->"+optionBox2.isDisplayed());
//5. Input Field:
//   - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
    WebElement inputtField=driver.findElement(By.xpath("//input[@id='inputField']"));
    inputtField.clear();inputtField.sendKeys("here is the custom text entered");
    }
}
