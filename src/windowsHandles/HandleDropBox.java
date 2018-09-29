package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectDropDown(day, "7");
		selectDropDown(month, "Feb");
		selectDropDown(year, "2015");

//		Select select_day = new Select(day);
//		select_day.selectByVisibleText("5");
//
//		Select select_month = new Select(month);
//		select_month.selectByVisibleText("May");
//
//		Select select_year = new Select(year);
//		select_year.selectByVisibleText("1990");

		Select select = new Select(day);
		select.selectByIndex(8);
		System.out.println(select.isMultiple());
	}
	public static void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
//		select.selectByValue(arg0);
//		select.selectByIndex(arg0);
		select.getOptions();
		select.getAllSelectedOptions();
		select.getFirstSelectedOption();
//		select.deselectByVisibleText(arg0);
//		select.deselectByValue(arg0);
//		select.deselectByIndex(arg0);
//		select.deselectAll();
		System.out.println("1:"+select.getOptions());
		System.out.println("2:"+select.getAllSelectedOptions());
		
		System.out.println("3:"+select.getAllSelectedOptions());
	}
}
