package browser_operations;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class BasicOperationsOnBrowser {
	
	public static void main(String args []) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		
		System.out.println("****************************************************");
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(450, 600));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.navigate().refresh();
		
		System.out.println("****************************************************");
		
		System.out.println("Validation of Login Page by Title: "+driver.getTitle().equals("vtiger"));
		
		System.out.println("Validation of Login Page by URL: "+driver.getCurrentUrl().contains("https://demo.vtiger.com/vtigercrm/index.php"));
		
		WebElement username = driver.findElement(By.id("username"));
		
		System.out.println("Is username input field is functional?: "+username.isEnabled());
		
		System.out.println("Is username input field is displayed?: "+username.isDisplayed());
		
		System.out.println("Is password input field is functional?: "+driver.findElement(By.id("password")).isEnabled());
		
		System.out.println("Is password input field is displayed?: "+driver.findElement(By.id("password")).isDisplayed());
		
		System.out.println("Default value of username field?: "+driver.findElement(By.id("username")).getAttribute("value"));
		
		WebElement signinButton = driver.findElement(By.className("button"));
		
		System.out.println("Default value of Signin button?: "+signinButton.getText());
		
		username.clear();
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.clear();
		
		username.sendKeys("admin");
		
		password.sendKeys("Test@123");
		
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.className("dropdown")).click();
		
		driver.findElement(By.className("userName")).click();
		
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
		
		
	}

}
