package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait {

	public static void main(String args[]) {
		
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");
		
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		//Addition of implicitly wait--
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com";
		System.out.println("Validation of login page by page URL : "+actualUrl.contains(expectedUrl));
		
		WebElement username = driver.findElement(By.name("username"));
		
		//username.clear();
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.className("orangehrm-login-button"));
		loginbutton.click();
		
		System.out.println("Validation of Home Page by URL : "+driver.getCurrentUrl().contains("viewEmployeeList"));
		
		driver.close();
	
	}
}


/**
 * to perform any operation first we need to identify the object/element from the 
 * application dn you can perform any required operation:
 * 		input type: sendkeys("Input");
 * 		click	  : click();
 * 		existing text deletion: clear();
 */

/**
 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
 * Operation: type  ----------> sendKeys();
 * 			 click  ----------> click();
 * 			existing delete---> clear()
 */

/**
 * In order to perform any operation on any element first identify it from WebPage, for that use findElement()
 * 
 * WebElement element= findElement(By.locator()); --> use to identify the element from the Web page and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */