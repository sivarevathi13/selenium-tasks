package Technical;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.leafground.com/");
	        
	        // Take a screenshot and save it as a file
	         File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        // Print the absolute path of the file
	        System.out.println("Screenshot saved at " + screenshotFile.getAbsolutePath());
	        driver.quit();
	    }

	}
	
	


