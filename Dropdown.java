package Technical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace1\\Taskprogram\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
	    WebElement SelectTool=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	    Select dropdown=new Select(SelectTool);
	    dropdown.selectByVisibleText("Playwright");
	    dropdown.selectByIndex(2);
	    List<WebElement>selectTool=dropdown.getOptions();
	   
	    for (WebElement selectoptions : selectTool) {
	    	System.out.println(selectoptions.getText());
	    }
	    	int ab=selectTool.size();
	    	System.out.println(selectTool.size());
	    	for(int i=0;i<ab;i++) {
	    		dropdown.selectByIndex(i);
			
		}
		}


	}


