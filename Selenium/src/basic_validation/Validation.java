package basic_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		
		driver.get("https://demo.actitime.com");
		
		System.out.println("************************************");
		
		//Login Page
		
		System.out.println("Login Page Validation: "+driver.getCurrentUrl().contains("actitime"));
		
		System.out.println("************************************");
		
		//Username
				
		WebElement usernameInputField = driver.findElement(By.id("username"));
		
		System.out.println("User name is displayed or not?: "+usernameInputField.isDisplayed());
		
		System.out.println("User name is functional or not?: "+usernameInputField.isEnabled());
		
		String defaultValueInUsernameInpputField = usernameInputField.getAttribute("placeholder");
		System.out.println("Default value in username input field: "+defaultValueInUsernameInpputField);
		System.out.println("Default value validation for user name input field status: "+ defaultValueInUsernameInpputField.equals("Username"));
		
		usernameInputField.sendKeys("admin");
		
		System.out.println("************************************");
		
		//Password
		
		System.out.println("Password is displayed or not?: "+driver.findElement(By.name("pwd")).isDisplayed());
		
		System.out.println("Password is functional or not?: "+driver.findElement(By.name("pwd")).isEnabled());
		
		System.out.println("Default value validation for password input field status: "+driver.findElement(By.name("pwd")).getAttribute("placeholder").equals("Password"));
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		System.out.println("************************************");
		
		//Keep me logged in checkbox
		
		System.out.println("checkbox is displayed or not?: "+driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed());
		
		System.out.println("checkbox is functional or not?: "+driver.findElement(By.id("keepLoggedInCheckBox")).isEnabled());
		
		System.out.println("Default name validation for checbox: "+driver.findElement(By.id("keepLoggedInLabel")).getText().equals("Keep me logged in"));
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		System.out.println("************************************");
		
		Thread.sleep(2000);
		
		//Login Button
		
		System.out.println("Is login button displayed or not?: "+driver.findElement(By.id("loginButton")).isDisplayed());
		
		System.out.println("login is functional or not?: "+driver.findElement(By.id("loginButton")).isEnabled());
		
		System.out.println("Default value validation for login button: "+driver.findElement(By.id("loginButton")).getText().equals("Login"));
		
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("************************************");
		
		//Home Page
		
		Thread.sleep(2000);
		
		System.out.println("Login page validation: "+driver.getCurrentUrl().contains("submit_tt"));
		
		System.out.println("************************************");
		
		//Logout Link
		
		System.out.println("Is logout link displayed or not?: "+driver.findElement(By.id("logoutLink")).isDisplayed());
		
		System.out.println("Is logout link functional or not?: "+driver.findElement(By.id("logoutLink")).isEnabled());
		
		System.out.println("Default value validation for logout link: "+driver.findElement(By.id("logoutLink")).getText().equals("Logout"));
		
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("************************************");		
		
	}

}

/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	
