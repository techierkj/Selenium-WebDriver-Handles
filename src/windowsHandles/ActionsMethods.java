package windowsHandles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Latest Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
		
		

		Actions act=new Actions(driver);
		act.build();
		act.click();
		act.click(element);
		act.clickAndHold();
		act.clickAndHold(element);
		act.doubleClick();
		act.contextClick();
		act.contextClick(element);
		act.doubleClick(element);
		act.dragAndDrop(source, target);
		act.dragAndDropBy(source, xOffset, yOffset);
		act.build().perform();
		Actions ac=act.keyDown(key);
		Actions ac=act.keyDown(target, key)
		Actions ac=act.keyUp(key);
		Actions ac=act.keyUp(target, key);
		Actions ac=act.moveByOffset(xOffset, yOffset);
		Actions ac=act.moveToElement(target);
		Actions ac=act.moveToElement(target, xOffset, yOffset);
		Actions ac=act.pause(duration);
		Actions ac=act.pause(pause);
		Actions ac=act.release();
		Actions ac=act.release(target);
		Actions ac=act.sendKeys(keys);
		Actions ac=act.sendKeys(target, keys);
		Actions ac=act.tick(arg0);
	
	}

}
