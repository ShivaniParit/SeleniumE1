package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	private static final String y_axis = null;

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.instagram.com/");
		
       WebElement loginButton = driver.findElement(By.name("username"));
      Point point =  loginButton.getLocation();
      int x_axis = point.getX();
      int y_axix = point.getY();
      System.out.println("x axix is:" +x_axis+" "+"Y axix is:"+ y_axix);
       
       		
         
	}

}
