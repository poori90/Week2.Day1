package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// Step 1: Download and attach the Chrome driver to this test case 
				WebDriverManager.chromedriver().setup();
				
				//Step 2 : Launch the Chrome Browse 
				ChromeDriver driver=new ChromeDriver();
				
				// Step 3: Load the URL 
				 driver.get("http://leaftaps.com/opentaps/");
				 
				 //Step 4 : Maximize the Browser 
				 driver.manage().window().maximize();
				 
				 //Step 5 : Find the UserName and Enter the Data
				 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				 
				 //Step 6: Find the Password and enter the Data 
				 
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 
				 // Step 7: Find the Login Button and Click 
				 
				 driver.findElement(By.className("decorativeSubmit")).click();
				 
				 //step 8 :  click  On  CRM/SFA 
				 
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 
				 //Step 9: Click On Contracts Tab
				 
				 driver.findElement(By.linkText("Contacts")).click();
				 
				 //Step 10 : Click On Create Contact Menu 
				 
				 driver.findElement(By.linkText("Create Contact")).click();
				 
				 //Step 11 : Find the Fore Name and enter the Data 
				 
				 driver.findElement(By.id("firstNameField")).sendKeys("Global");
				 
				 //Step 12: Find the Surname and enter the data
				 
				 driver.findElement(By.id("lastNameField")).sendKeys("Test");
				 
				 //Step 13: Find the Contact Button and Click 
				 
				 driver.findElement(By.className("smallSubmit")).click();
				 
				 //Step 14: Print the first name 
				 
				 String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
				System.out.println("First Name is " + firstName);
				 
				 
				 //Step 15: Print the browser title 
				String title = driver.getTitle();
				System.out.println("Title is " + title);
				
				
				//Step 16: close the browser
				driver.close();
	}

}
