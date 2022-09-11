package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		// Type username as admin
		
		WebElement username = driver.findElement(By.id("username"));
		
		/**
		 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
		 * Operation: type  ----------> sendKeys();
		 * 			 click  ----------> click();
		 * 			existing delete---> clear()
		 */
		
		
		username.clear();
		username.sendKeys("admin");
		
		// Type password as Test@123
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Test@123");
		
		// Click on Sign in button
		
		WebElement signin = driver.findElement(By.className("buttonBlue"));
		signin.click();
				
		
	}

}
