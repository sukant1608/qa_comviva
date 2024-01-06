package cricketscorecard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CricbuzScore {
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/sukant.thakur/Downloads/geckodriver-v0.32.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2023-24-1387592/south-africa-vs-india-1st-test-1387603/full-scorecard");
		WebElement score_table = driver.findElement(By.xpath("//table/tbody"));
		List<WebElement> table_rows = score_table.findElements(By.tagName("tr"));
//		System.out.println(table_rows);
		boolean flag = true;
		for(WebElement x:table_rows)
		{
			flag = !flag;
			if(flag)
			{
				continue;
			}
			WebElement name = x.findElement(By.xpath("(//td[1]/div/a)"));
			System.out.println(name.getText());
//			System.out.println(name);
		}
		
		driver.quit();
		
	
	}
}
