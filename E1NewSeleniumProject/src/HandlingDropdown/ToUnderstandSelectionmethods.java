package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelectionmethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/Shivani/Desktop/webelements/breakfast.html");
		
	WebElement singleSelectDD = driver.findElement(By.id("menu"));
	
	Select sel =  new Select (singleSelectDD);
	
	sel.selectByIndex(4);
	Thread.sleep(5000);
	
	sel.selectByValue("V3");
	Thread.sleep(5000);
	
	sel.selectByVisibleText("samosa");
	Thread.sleep(5000);
	}

}
