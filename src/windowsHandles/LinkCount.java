package windowsHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++){
			System.out.println(linkList.get(i).getText());
			String linkText = linkList.get(i).getText();
				if(linkText.equals("Create a Page")){
					linkList.get(i).click();
					break;
				}
		}
		
		
		
		
		
	}

}
