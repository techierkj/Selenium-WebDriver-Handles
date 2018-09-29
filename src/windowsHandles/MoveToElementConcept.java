package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		Actions action = new Actions(driver);
		//menu and sub menu handling:

		WebElement contribute_parentLink = driver.findElement(By.linkText("Contribute"));

		action.moveToElement(contribute_parentLink).build().perform();

		Thread.sleep(3000);

		if (driver.findElement(By.linkText("Code")).isDisplayed()) {
			driver.findElement(By.linkText("Code")).click();
		}else{
			System.out.println("no code link");
		}

	}

}
