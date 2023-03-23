package Technical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CrossbrowseTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define the web driver executable path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\geckodriver.exe");

        // Create Firefox options for headless mode
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(true);

        // Test in Chrome browser
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        WebElement element = chromeDriver.findElement(By.id("email"));
        element.sendKeys("Selenium");
        element.submit();
        System.out.println("Page title in Chrome browser is: " + chromeDriver.getTitle());
        chromeDriver.quit();

        // Test in Firefox browser
        WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
        firefoxDriver.get("https://www.facebook.com/");
        WebElement element1 = firefoxDriver.findElement(By.id("email"));
        element1.sendKeys("Selenium");
        element1.submit();
        System.out.println("Page title in Firefox browser is: " + firefoxDriver.getTitle());
        firefoxDriver.quit();

    }

}

	


