package Technical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

		// Set the path of the file to be uploaded
		String filePath = "/path file";
		fileInput.sendKeys(filePath);

	}

}
