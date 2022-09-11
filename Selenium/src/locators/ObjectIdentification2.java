package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification2 {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "demo.actitime.com";
		System.out.println("Validation by page URL : " + actualUrl.contains(expectedUrl));

		// Locating username by id

		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * 
		 * username.clear(); username.sendKeys("admin");
		 */

		// Locating username by name

		/*
		 * WebElement username = driver.findElement(By.name("username"));
		 * username.clear(); username.sendKeys("admin");
		 */

		// Locating username by className
		
		WebElement username = driver.findElement(By.className("textField"));
		username.clear();
		username.sendKeys("admin");
		
		
		
		//************************************************
		
		
		

		// Locating password by name

		
		/*  WebElement password = driver.findElement(By.name("pwd"));
		  password.clear(); 
		  password.sendKeys("manager");*/
		
		// Locating password by className
		 

		//WebElement password = driver.findElement(By.className("textField pwdfield")); ====error
		WebElement password = driver.findElement(By.className("pwdfield"));
		password.clear();
		password.sendKeys("manager");
		

		//************************************************
		
		//Locating Login button by id
		
		/*WebElement login = driver.findElement(By.id("loginButton"));
		login.click();*/
		
		//Locating Login button by className
		
		WebElement login = driver.findElement(By.className("initial"));
		login.click();
		
		
		driver.close();
		

	}
}