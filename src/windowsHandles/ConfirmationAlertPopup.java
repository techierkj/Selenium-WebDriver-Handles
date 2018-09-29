package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		// Alert is an interface/api used to handle alerts
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		a.accept();
		//a.dismiss(); it will accept if only accept button there, no cancel 
		System.out.println("Alert message:"+s);
		Thread.sleep(1000);
		System.out.println("Check if alert is accepted");
		driver.quit();
		//driver.close();// NoSuchSessionException

	}

}
