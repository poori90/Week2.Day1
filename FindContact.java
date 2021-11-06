package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v88.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

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
	
	
		 // Step 10 : Click on Find Contacts Menu
		 
		 driver.findElement(By.linkText("Find Contacts")).click();
		 
		 // Step 11: xpath to click on email
			driver.findElement(By.xpath("//span[text()='Email']")).click();
			
		//Step 12 : type mail id to search
			driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
			
		
		//Step 13 : click Find Contacts
			driver.findElement(By.xpath("//button[text()='Find Contacts']")).click(); 
		 
		//Step 14: close the browser
			driver.close();
	}
	
}
