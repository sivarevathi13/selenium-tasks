package Technical;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://demoqa.com/alerts");

	        // Positive scenario
	        WebElement btn = driver.findElement(By.xpath("//button[@id='alertButton']"));
	        btn.click();

	        // Switch to the alert and accept it
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert text: " + alertText);
	        alert.accept();

	        //negative scenerio 
	        WebElement invalidBtn = driver.findElement(By.id("invalid-button"));
	        invalidBtn.click();

	       
	        try {
	            Alert invalidAlert = driver.switchTo().alert();
	            String invalidAlertText = invalidAlert.getText();
	            System.out.println("Invalid alert text: " + invalidAlertText);
	            invalidAlert.dismiss();
	        } catch (Exception e) {
	            System.out.println("No alert was triggered for the invalid button click.");
	        }
	        
	        driver.quit();
	    }
	

	}


