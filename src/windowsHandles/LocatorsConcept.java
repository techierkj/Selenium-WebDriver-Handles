package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/");
		
		//1. id: -- I unique
//		WebElement loginName = driver.findElement(By.id("login-username"));
//		loginName.sendKeys("testselenium@yahoo.com");
//		
//		WebElement nextBtn = driver.findElement(By.id("login-signin"));
//		nextBtn.click();
		
		//2. name: -- II  unique
//		WebElement loginName = driver.findElement(By.name("username"));
//		loginName.sendKeys("testselenium@yahoo.com");
//		
//		WebElement nextBtn = driver.findElement(By.name("signin"));
//		nextBtn.click();
		
		//3. xpath: --III
//		WebElement loginName = driver.findElement(By.xpath("//*[@id='login-username']"));
//		loginName.sendKeys("testselenium@yahoo.com");
//		
//		WebElement nextBtn = driver.findElement(By.xpath("//*[@id='login-signin']"));
//		nextBtn.click();
		
		//4. cssSelector: III
//		WebElement loginName = driver.findElement(By.cssSelector("#login-username"));
//		loginName.sendKeys("testselenium@yahoo.com");
//		
//		WebElement nextBtn = driver.findElement(By.cssSelector("#login-signin"));
//		nextBtn.click();
		
		//5. linkText: only for links: --IV
//		WebElement troubleSingingLink = driver.findElement(By.linkText("Difficulty signing in?"));
//		troubleSingingLink.click();
		
		//6. partialLinkText: only for links but not recommended --V
		//Difficulty signing in?
		//Difficulty registration?
//		WebElement troubleSingingLink = driver.findElement(By.partialLinkText("Difficulty"));
//		troubleSingingLink.click();
		
		//7. className: not recommended -- not unique --V
		WebElement loginName = driver.findElement(By.className("phone-no "));
		loginName.sendKeys("testselenium@yahoo.com");
		
		driver.findElement(By.className("orko-button-primary")).click();
		
		
	}

}
