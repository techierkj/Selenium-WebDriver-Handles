package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));

		Actions action = new Actions(driver);

		action.contextClick(rightClickButton).build().perform();

		WebElement copy = driver.findElement(By.className("context-menu-icon-copy"));
		System.out.println(copy.getText());

	}
}
