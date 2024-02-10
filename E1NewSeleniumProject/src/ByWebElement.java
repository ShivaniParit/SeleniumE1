import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		
		
	      EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.instagram.com/");
			Thread.sleep(3000);
			
			WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Log in']"));
			File src = efwd.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./screenshots/loginbutton.jpg");
			  Files.copy(src, dest);
	}

}
