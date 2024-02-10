package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

	private static final WebElement MultiSelectDD = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("file:///C:/Users/Shivani/Desktop/webelements/breakfast.html");
		
		 WebElement MltiSelectDD = driver.findElement(By.id("menu"));
		 Select sel = new Select (MultiSelectDD);
		 sel.selectByVisibleText("Utappa");
		 Thread.sleep(3000);
		 sel.deselectByVisibleText("Utappa");
		 
		
		
	}

}
