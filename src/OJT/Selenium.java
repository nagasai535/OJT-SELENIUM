package OJT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {


    @Test
	public void test() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Welcome  to Ebay...");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		

	}

}
