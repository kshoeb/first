/**
 *   Program to display the google search list and based on the any option click on the link
 */
package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSearch {

	public static void main (String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total number of suggestion in the google List :==> " + list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial"))
			{
				list.get(i).click();
				break;
			}
			
		}
		driver.close();
		driver.quit();
		
	}
}
