package Week_4.Day_2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHTML2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// 1. Launch the URL https://html.com/tags/table/
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 2. You have to print the respective values based on given Library
		//(hint: if the library was absolute usage, then print all its value
		
		WebElement marketshare = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[1]"));
        String market = marketshare.getText();
        
        
        WebElement absoluteshare = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[2]"));
        String absshare = absoluteshare.getText();
        
        
        if (absshare.contains("Absolute")) {
        	System.out.println(absshare);
		}
        else {
        	System.out.println(market);
		}
	}

}