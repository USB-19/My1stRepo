package webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetupForChrome {

	public static void main(String args[]) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

		// or Use WebDriverManager to manager chrome browser executable based on system
		// requirement

		// use setup method of WebDriverManager

		WebDriverManager.chromedriver().setup();

		// step2: create an instance of Chrome Browser

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

	}
}
