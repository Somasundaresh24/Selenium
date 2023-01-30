package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/select.xhtml");
		String names="Playwright,Cypress";
		String[] split = names.split(",");//0,1
		
		WebElement dd=driver.findElement(By.className("ui-selectonemenu"));
		Select sec=new Select(dd);
		List<WebElement> options = sec.getOptions();
		for (int i = 1; i < options.size()-1; i++) {
			String text = options.get(i).getText();
			for (int j = 0; j < split.length; j++) {
				if (text.equalsIgnoreCase(split[j])) {
					Thread.sleep(2500);
					options.get(i).click();
					String text2 = options.get(i).getText();
					System.out.println(text2);
				}
			}
			
		}
	}

}
