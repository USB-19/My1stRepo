package basicoperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class OPenGoogleWithChrome {
	
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");
	
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("https://www.google.com/");
	
		ChromeDriver cdriver1 = new ChromeDriver();
		
		cdriver1.get("https://www.facebook.com/");
	}

}
