package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBro {
	
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Drivers\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	
	@Test
	public void petStoreTC1() throws InterruptedException {
	driver.get("https://petstore.octoperf.com/");
	driver.findElement(By.partialLinkText("Enter")).click();
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("username")).sendKeys("brittofrancis28");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).clear();
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("P@ssw0rd3");
	Thread.sleep(3000);
	driver.findElement(By.name("signon")).click();
	driver.quit();
	}

}
