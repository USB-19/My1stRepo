package css_value_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValueValidation {

	public static void main(String args[]) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

	

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
		WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		System.out.println("Sign In Button Font Color :"+signInButton.getCssValue("color")); //rgba(255, 255, 255, 1) //can be checked by googling hexa to rgb converter
		
		System.out.println("Sign In Button Font Size :"+signInButton.getCssValue("font-size")); //16px
		
		System.out.println("Sign In Button Background Colour :"+signInButton.getCssValue("background-image")); //linear-gradient(rgb(53, 170, 71) 0px, rgb(53, 170, 71) 100%)
	
		
		WebElement forgotPasswordLink =driver.findElement(By.cssSelector(".forgotPasswordLink"));
		
		System.out.println("Forgot password text color :"+forgotPasswordLink.getCssValue("color")); // rgba(17, 85, 204, 1)
		
}
}
