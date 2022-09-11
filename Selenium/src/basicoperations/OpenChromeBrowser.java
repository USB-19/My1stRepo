package basicoperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		//Step1: set the path of required browser executable file using System.setProperty(key, value);
		 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		//Step2: create an instance of required browser class
		
		
		ChromeDriver cdriver = new ChromeDriver();
		

	}
}