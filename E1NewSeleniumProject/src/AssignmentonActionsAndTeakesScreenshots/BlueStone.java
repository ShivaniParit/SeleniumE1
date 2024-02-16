package AssignmentonActionsAndTeakesScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
	     WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
	     boolean result = coins.isDisplayed();
	     System.out.println(result);
		
		
		
		//TakesScreenshot ts = (TakesScreenshot)driver;
		//File src = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./screenshots/Bluestone.com.jpg");
		//Files.copy(src, dest);
		
	
	}

}
