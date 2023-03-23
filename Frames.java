package Technical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		 int count=driver.findElements(By.tagName("iframe")).size();
		 System.out.println(count);
		 driver.switchTo().frame(2);
		 driver.switchTo().frame(0);
         driver.findElement(By.xpath("//button[@id='Click']")).click();
         driver.switchTo().defaultContent();
		 

	}

	}


