package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
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
