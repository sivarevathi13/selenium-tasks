package Technical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://leafground.com/file.xhtml");
          WebElement fileInput = driver.findElement(By.id("j_idt88:j_idt89_input"));
          //fileInput.click();
          fileInput.sendKeys("C:\\Users\\sathi\\Downloads\\Sivarevathy Software.jpg");
	      fileInput.submit();
	   }
	
}
	


