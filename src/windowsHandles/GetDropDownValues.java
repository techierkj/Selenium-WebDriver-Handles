package windowsHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropDownValues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");
		
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(monthList.size());
		
		for(int i=1; i<monthList.size(); i++){
			System.out.println(monthList.get(i).getText());
		}
		
		Select day=new Select(driver.findElement(By.id("day")));
		Select month=new Select(driver.findElement(By.id("month")));	
		Select year=new Select(driver.findElement(By.id("year")));	
		day.selectByIndex(3);
		month.selectByValue("1");
		year.selectByVisibleText("2017");
		Thread.sleep(5000);
//		day.deselectAll();		// works only for multiselect
//		day.deselectByVisibleText("3");	//works only for multiselect
//		month.deselectByIndex(1);		//works only for multiselect
//		year.deselectByValue("2017");		//works only for multiselect
		Thread.sleep(5000);
	}

}
