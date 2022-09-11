package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait1 {
	
public static void main(String args[]) throws InterruptedException {
		
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");
		
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
		
		System.out.println("Login Page Validation by Page Title : "+driver.getTitle().equals("actiTIME - Login"));
		System.out.println("Login Page Validation by Page URL : "+driver.getCurrentUrl().contains("https://demo.actitime.com/"));

		/*WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		//OR
*/	
		driver.findElement(By.id("username")).sendKeys("admin");

		/*WebElement passwordInputField = driver.findElement(By.name("pwd"));
		usernameInputField.sendKeys("manager");
		//OR
*/	
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		/*WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		//OR
*/		
		driver.findElement(By.id("loginButton")).click();
		
		//System.out.println("Home Page Validation by Page Title : "+driver.getTitle().equals("actiTIME -  Enter Time-Track")); //false as time is not sufficient to load page
		//System.out.println("Home Page Validation by Page URL : "+driver.getCurrentUrl().equals("submit_tt.do")); //false
		
		//Adding explicit time wait--
		Thread.sleep(2000);
		
		System.out.println("Home Page Validation by Page Title : "+driver.getTitle().equals("actiTIME - Enter Time-Track"));
		System.out.println("Home Page Validation by Page URL : "+driver.getCurrentUrl().contains("submit_tt.do"));	
		
		/*WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		//OR
*/
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("Login Page Validation by Page Title : "+driver.getTitle().equals("actiTIME - Login"));
		System.out.println("Login Page Validation by Page URL : "+driver.getCurrentUrl().contains("https://demo.actitime.com/"));

		driver.close();
			
}
}
