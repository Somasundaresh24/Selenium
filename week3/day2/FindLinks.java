package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));
		
		//number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		//second link name
		WebElement elmSecndLink = links.get(41);
		String text = elmSecndLink.getText();
		System.out.println("41th link of this page"+text);
		
		List<String>list=new ArrayList<String>();
		
		//Total link text
		for(WebElement each:links) {
			String linkText = each.getText();
			list.add(linkText);
			System.out.println(linkText);
		}
		System.out.println(list);
		//To sort
		Collections.sort(list);
		System.out.println(list);
	}

}
