package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("manager1234");
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(60);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
