package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  //To launch the browser
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();  //To navigate backword
		Thread.sleep(1000);
		driver.navigate().forward();  //To navigate forword
		Thread.sleep(1000);
		driver.navigate().refresh();  //to refresh the page
		

	}

}
