package windowsHandles;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchTabHandle {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\Latest Selenium Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
	}

	@Test
	public void openTab() {
		// Open tab 2 using CTRL + t keys.
		driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
		// Open URL In 2nd tab.
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");

		// Call switchToTab() function to switch to 1st tab
		switchToTab();

		// Call switchToTab() function to switch to 2nd tab.
		switchToTab();

		// Call switchToTab() function to switch to 1st tab
		switchToTab();
	}

	public void switchToTab() {
		// Switching between tabs using CTRL + tab keys.
		driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "\t");
		// Switch to current selected tab's content.
		driver.switchTo().defaultContent();
	}
}