package windowsHandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNaukriMultipleWindows {

	@Test
	public void TestPopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}
}