package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchSalesforce {

	public static void main(String[] args) {
		//To launch the browser
		EdgeDriver driver= new EdgeDriver();
		//load the url
		driver.get("https://login.salesforce.com/?locale=in");
		//maximize window
		driver.manage().window().maximize();
		String parentWindow = driver.getTitle();
		System.out.println("ParentWindow title:"+parentWindow);
		//enter the username
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("hari.radhakrishnan@qeagle.com");//hari.radhakrishnan@qeagle.com
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		//click Login button
		driver.findElement(By.id("Login")).click();
		//get the titlee
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.id("error")).getText();
		System.out.println(text);
		if (text.contains("contact")) {
			System.out.println("Login not Successful");
		}
		else {
			System.out.println("Login Successful");
		}
	}

}
