package basicoperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {
	
	public static void main (String args[]) {
				
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * 		path: 
		 * 		1. absolute path --> C:\Users\SANDESH\OneDrive\Desktop\Acceleration 18 May\Automation Testing\Programs\Eclipse\Selenium\Executables\chromedriver.exe
		 * 		2. Relative path --> .\\Executables\\chromedriver.exe
		 * Step2: create an instance of required browser class
		 */
		
		String currentWorkingDir = System.getProperty("user.dir");
		
		System.out.println(currentWorkingDir);  //C:\Users\SANDESH\OneDrive\Desktop\Acceleration 18 May\Automation Testing\Programs\Eclipse\Selenium
		
		String chromeExePath = currentWorkingDir+"\\Executables\\chromedriver.exe";

		System.out.println(chromeExePath); //C:\Users\SANDESH\OneDrive\Desktop\Acceleration 18 May\Automation Testing\Programs\Eclipse\Selenium\Executables\chromedriver.exe

		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		
		WebDriver driver = new ChromeDriver();
		
		
		
		// To enter url on browser
		
		driver.get("https://www.google.com");
		
		System.out.println("*******************************");
		
		// To validate page title
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("Actual Google Page Title : "+actualTitle);
		System.out.println("Expected Google Page Title : "+expectedTitle);
		System.out.println("Page Title Validation : "+actualTitle.equals(expectedTitle));
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is Failed");
		}
		
		
		System.out.println("*******************************");
		
		//To validate page URL
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.google.com";
		System.out.println("Actual Google Page URL : "+actualUrl); //https://www.google.com/
		System.out.println("Expected Google Page URL : "+expectedUrl); //https://www.google.com
		System.out.println("Page URL Validation : "+actualUrl.equals(expectedUrl)); //false as both url is not exact matching
		System.out.println("Page URL Validation : "+actualUrl.contains(expectedUrl)); //true as both url contains same keywords
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Current URL validation is passed");
		}else {
			System.out.println("Current URL validation is Failed");
		}
		
		System.out.println("*******************************");
		
		//To get page source code
		
		String pageSourceCode = driver.getPageSource();
		//System.out.println(driver.getPageSource());
		//System.out.println(pageSourceCode);
		System.out.println("Page source code content length: "+pageSourceCode.length());
		
		System.out.println("*******************************");
		
		//To close the current browser
		driver.close();
		System.out.println("Browser has been closed");
		
		System.out.println("*******************************");
	}

}	
