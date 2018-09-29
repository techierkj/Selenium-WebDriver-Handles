package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMultiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");

		WebElement select1 = driver.findElement(By.xpath("//*[@id='post-1305']/div[2]/p[2]/select/option[1]"));
		WebElement select2 = driver.findElement(By.xpath("//*[@id='post-1305']/div[2]/p[2]/select/option[2]"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();

	}

}
