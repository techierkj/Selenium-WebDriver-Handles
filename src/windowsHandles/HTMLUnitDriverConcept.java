package windowsHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {

		//before 3.0.6: 
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.freecrm.com");
		
		System.out.println(driver.getTitle());
		
		//phantomJS + GhostDriver ==> deprecated
		
	}

}
