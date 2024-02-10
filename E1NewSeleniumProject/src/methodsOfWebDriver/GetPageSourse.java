package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/search?client=firefox-b-d&q=google");
		Thread.sleep(2000);
		String PageSourse = driver.getPageSource();
		System.out.println(PageSourse);
		// TODO Auto-genera;ted method stub

	}

}
