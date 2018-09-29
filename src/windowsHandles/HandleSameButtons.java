package windowsHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSameButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		Thread.sleep(5000);
		
		List<WebElement> signupList  = driver.findElements(By.linkText("Pricing"));
		System.out.println(signupList.size());
		if(signupList.size()>0){
			signupList.get(0).click();
		}
		
//		List<WebElement> btnList = driver.findElements(By.className("btn"));
//		
//		System.out.println(btnList.size());
//		Thread.sleep(5000);
		
		//btnList.get(2).click();
//		for(int i=0; i<btnList.size(); i++){
//			System.out.println(btnList.get(i).getText());
//			if(i==3){
//				btnList.get(i).click();
//				break;
//			}
//		}
		
	}

}
