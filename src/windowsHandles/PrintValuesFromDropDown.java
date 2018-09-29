package windowsHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintValuesFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		WebElement month = driver.findElement(By.id("month"));

		Select select = new Select(month);
		List<WebElement> monthList = select.getOptions();
		System.out.println(monthList.size());
		ArrayList<String> ar = new ArrayList<String>();

		for (int i = 0; i < monthList.size(); i++) {
			String monthVal = monthList.get(i).getText();
			System.out.println(monthVal);
			if (!monthVal.equals("Month")) {
				ar.add(monthVal);
			}
		}
		System.out.println(ar);

	}

}
