package windowsHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelectDropBox {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();

		WebElement mySelectElement = driver.findElement(By.name("multipleselect[]"));
		Select dropdown = new Select(mySelectElement);
		// select
		dropdown.selectByVisibleText("Performance Testing");
		Thread.sleep(2000);
		// deselect
		dropdown.deselectByVisibleText("Performance Testing");

		// Select All by Index
		WebElement we = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div/form/p[6]/select"));
		Select select = new Select(we);
		List<WebElement> list = select.getOptions();
		for (int i = 0; i < list.size(); i++) {
			select.selectByIndex(i);
		}
		Thread.sleep(4000);
		// Deselect All By visible Text
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			select.deselectByVisibleText(list.get(i).getText());
		}
		Thread.sleep(4000);
		// Select all by value
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAttribute("value"));
			select.selectByValue(list.get(i).getAttribute("value"));
		}
		Thread.sleep(4000);
		// Deselect All
		select.deselectAll();
		
		Thread.sleep(4000);
		driver.close();
	}
}