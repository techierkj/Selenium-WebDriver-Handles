package windowsHandles;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http:www.freecrm.com");
		takeScreenShot("loginPage", driver);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign Up")).click();
		takeScreenShot("signUpPage", driver);

	}

	public static void takeScreenShot(String fileName, WebDriver driver) {
		// 1. convert Webdriver ref to TakeScreenshot:
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		// 2. call getScreenshotAs method to create a file:
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		
		try {
			File target=new File("E:\\Snap" + fileName + ".jpg");
			FileUtils.copyFile(src,target );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
