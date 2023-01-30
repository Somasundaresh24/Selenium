package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptionsDD {

 public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("http://www.leafground.com/select.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
	Select sec=new Select(dd);
	List<WebElement> options = sec.getOptions();
	int size = options.size();
	System.out.println(size);
	//	datatype variable :data
	for (WebElement each : options) {
		String text = each.getText();
		System.out.println(text);
	}
}

}
