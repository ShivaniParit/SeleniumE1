package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		
		WebElement radioButton = driver.findElement(By.xpath("//span[text()='UPI']"));
		
		System.out.println(radioButton.isSelected()); 
		

	}

}
