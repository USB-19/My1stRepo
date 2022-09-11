package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStandardDropdown {

		public static void main(String args[]) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SANDESH\\OneDrive\\Desktop\\Acceleration 18 May\\Automation Testing\\Programs\\Eclipse\\Selenium\\Executables\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// driver.manage().window().maximize();

			driver.get("http://demo.automationtesting.in/Register.html");
		
			System.out.println("***********************Skills Dropdown*********************");
			
			//**** Identify dropdown list
			
			WebElement dropdownSkills = driver.findElement(By.id("Skills"));
			
			
			//**** Create an instance of Select class and pass above element into its constructor
			
			Select selectSkills = new Select(dropdownSkills);
			
			//OR
			
			//Select selectSkills1 = new Select(driver.findElement(By.id("Skills")));
			
			
			//**** check whether dropdown is multiselect dropdown or not
			
			System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkills.isMultiple());
			
			//**** get default or already select option
			
//			WebElement selectedOption = selectSkills.getFirstSelectedOption();
//			String selectedOptionName = selectedOption.getText();
//			System.out.println("Already selected option name: "+selectedOptionName);
				//OR
			System.out.println("Already selected option name: "+selectSkills.getFirstSelectedOption().getText());
			
			//**** get option count
			
			List<WebElement> options = selectSkills.getOptions();
			System.out.println("Option count is:"+options.size());
			
			//**** Get dropdown option names
			for(int i=0;i<options.size();i++) {
				System.out.println("Option "+i+": "+options.get(i).getText());
			}
			
			//**** select options from dropdown
			
			selectSkills.selectByIndex(4);
			System.out.println("Already selected option name: "+selectSkills.getFirstSelectedOption().getText());
					//or
			selectSkills.selectByValue("Backup Management");
			System.out.println("Already selected option name: "+selectSkills.getFirstSelectedOption().getText());
					//or
			selectSkills.selectByVisibleText("Analytics");
			System.out.println("Already selected option name: "+selectSkills.getFirstSelectedOption().getText());
			
			System.out.println("***********************Select Country Dropdown*********************");
			
			WebElement dropdownSelectCountry = driver.findElement(By.cssSelector(" .col-md-4 #country"));
			Select selectCountry = new Select(dropdownSelectCountry);
			
			System.out.println("Is multiple country can be selected? : "+selectCountry.isMultiple());
			
			List<WebElement> countryName = selectCountry.getOptions();
			System.out.println("Country option count is : "+countryName.size());
			for(int i=0; i<countryName.size(); i++) {
				System.out.println("Country options name : "+i+" : "+countryName.get(i).getText());
			}
			
			System.out.println("First Selected Option : "+selectCountry.getFirstSelectedOption().getText());
			
			selectCountry.selectByIndex(5);
			System.out.println("First Selected Option : "+selectCountry.getFirstSelectedOption().getText());
			
			selectCountry.selectByValue("New Zealand");
			System.out.println("First Selected Option : "+selectCountry.getFirstSelectedOption().getText());
			
			selectCountry.selectByVisibleText("India");
			System.out.println("First Selected Option : "+selectCountry.getFirstSelectedOption().getText());
			
			System.out.println("***********************END*********************");
			
		}		
}			