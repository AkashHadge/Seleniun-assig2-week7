package Seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumAssig2 {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Selenium...");
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		driver.close();
 

	}


}
