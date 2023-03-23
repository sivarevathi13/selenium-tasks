package Technical;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switchnewwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");

        
        WebElement button = driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
        button.click();

        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String originalWindowHandle = driver.getWindowHandle();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(originalWindowHandle);
        String newWindowHandle = windowHandles.iterator().next();
        driver.switchTo().window(newWindowHandle);

        // Perform actions on the new window
        String newWindowTitle = driver.getTitle();
        String newWindowUrl = driver.getCurrentUrl();
        System.out.println("Title of new window: " + newWindowTitle);
        System.out.println("URL of new window: " + newWindowUrl);

        
        driver.close();
        driver.switchTo().window(originalWindowHandle);

        // Perform actions on the original window
        String originalWindowTitle = driver.getTitle();
        String originalWindowUrl = driver.getCurrentUrl();
        System.out.println("Title of original window: " + originalWindowTitle);
        System.out.println("URL of original window: " + originalWindowUrl);

        
        driver.quit();
    }

}





	


