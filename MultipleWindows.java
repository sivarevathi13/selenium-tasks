package Technical;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//open website
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//get parentwindowhandle
		String parentWindowHandle=driver.getWindowHandle();
		
        //get allwindow 
		Set<String>WindowHandles=driver.getWindowHandles();
		//loop through all window handle
		for (String windowHandle : WindowHandles) {
            // Switch to the window
            driver.switchTo().window(windowHandle);

            // If it's not the parent window, close it
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.close();
            }

	}
    
		// Switch back to the parent window
        driver.switchTo().window(parentWindowHandle);
        
     // Click on the "Jobs" link
        WebElement jobsLink = driver.findElement(By.linkText("Jobs"));
        jobsLink.click();

        // Get all window handles again
        WindowHandles = driver.getWindowHandles();

        // Loop through all window handles
        for (String windowHandle : WindowHandles) {
            // Switch to the window
            driver.switchTo().window(windowHandle);

            // If it's not the parent window, close it
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.close();
            }
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindowHandle);

        // Quit the driver
        driver.quit();
    }
}

