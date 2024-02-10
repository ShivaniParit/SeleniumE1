package practice1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {

      System.setProperty("Webdriver.firefox.driver", "./drivers/firefoxdriver.exe")	;
      new FirefoxDriver();

	}

}
