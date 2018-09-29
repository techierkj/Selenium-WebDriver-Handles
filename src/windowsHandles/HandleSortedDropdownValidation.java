package windowsHandles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleSortedDropdownValidation {

	@Test
	public static void Check() {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		WebElement month = driver.findElement(By.id("month"));
		Select sel = new Select(month);

		List<WebElement> list = sel.getOptions();
		ArrayList<String> arraylist = new ArrayList<>();
		ArrayList<String> arraylist1 = new ArrayList<>();
		
		for (WebElement monthValue : list) {
			arraylist.add(monthValue.getText());
			arraylist1.add(monthValue.getText());
		}
		arraylist.remove(0);
		arraylist1.remove(0);
		
		Collections.sort(arraylist);
		Assert.assertEquals(arraylist1, arraylist);
	}
}
