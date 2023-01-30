package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		//Load the Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaresh");
		driver.findElement(By.className("smallSubmit")).click();
		String text =driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equalsIgnoreCase("soma")) {
			System.out.println("Lead create Successfully"); 
		}
		else {
			System.out.println("Lead is not create Successfully");
		}
	}

}
