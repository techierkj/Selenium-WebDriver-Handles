package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//dynamic wait -- only for page loading: Global wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//implicitly wait -- for all the web elements: Global wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		
		
		
		
		
	}

}
