package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		// Alert is an interface/api used to handle alerts
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert .getText();
		System.out.println("Alert text is " + alertText);
		//Send some text to the alert
		promptAlert .sendKeys("Accepting the alert");
		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
		promptAlert .accept();
		
		driver.quit();
		//driver.close();// NoSuchSessionException

	}

}
