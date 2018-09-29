package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		
		WebElement we = driver.findElement(By.xpath("//*[@id='finish']/h4"));
		ExplicitWaitMethod(we, driver, 10);
		String value = driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
		System.out.println(value);
	}

	public static void ExplicitWaitMethod(WebElement we, WebDriver driver, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}
	
}
