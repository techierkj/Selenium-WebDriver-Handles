package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/");

		Actions action=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//*[@id='header']/div[1]/ul/li[7]/div"));
		Action ac=action.moveToElement(we).build();
		ac.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='header']/div[1]/ul/li[7]/div/div/a[2]/span")).click();
		
	}
}
