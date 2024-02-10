package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //To Launch the browser
		Thread.sleep(1000);
		driver.manage().window().maximize();  //To maximize the browser
		Thread.sleep(1000);
		
		Dimension targetSize = new Dimension(700,200);    //To pass width and height
		
		((Window) driver.manage()).setSize(targetSize);   //to pass the dimension to setsize method
		// TODO Auto-generated method stub

	}

}
