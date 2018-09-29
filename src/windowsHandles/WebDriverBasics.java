package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. launch the browser:
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//c:\\test\\chromedriver.exe
		driver.get("http://www.google.com"); //2. enter url
		
		String title = driver.getTitle(); //3. get the title
		System.out.println("google page title is: " + title);
		
		//validation point, checkpoint:
		if(title.equals("Google")){
			System.out.println("correct title");
		}else{
			System.out.println("in - correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//quit the browser:
		driver.quit();
		
	}

}
