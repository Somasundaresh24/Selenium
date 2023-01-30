package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		List<Integer> listOfPrice=new ArrayList<Integer>();
		for(WebElement each : prices) {
			String text = each.getText();//5,789
			System.out.println(text);
			String replaceAll = text.replaceAll(",","");
			System.out.println(replaceAll);//5789
			if (!replaceAll.isEmpty()) {   //important
				int parseInt = Integer.parseInt(replaceAll);
				listOfPrice.add(parseInt);
			}
		}
		Collections.sort(listOfPrice);
		System.out.println(listOfPrice);
		System.out.println("List Size"+ listOfPrice.size());
		System.out.println("The least value:"+listOfPrice.get(0));
		
		Set<Integer> set =new TreeSet<>(listOfPrice);
		
		
		System.out.println("Set size"+set.size());
		System.out.println(set);
		if (listOfPrice.size()!=set.size()) {
			System.out.println("Duplicates Found");
		}
		else {
			System.out.println("No Duplicates Found");
		}
	}
	

}
