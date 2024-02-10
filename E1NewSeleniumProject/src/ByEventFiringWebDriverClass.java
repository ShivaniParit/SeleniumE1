import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriverClass {

	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
      EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/");
		
		File src = efwd.getScreenshotAs(OutputType.FILE);
		
		 File dest = new File("./screenshots/instagram.jpg");
		 
		 Files.copy(src, dest);
	}

}
