import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchApplication {
@Test
	public void locatingElements() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	

		
	//driver.findElement 
		//(By.name("Email")).sendKeys("Hema");
		//String name = driver.findElement(By.name("Email")).getAttribute("Value");
		//System.out.println("The name is:>"+name);

	
		
		//Xpath//driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("Hkarunagaran@accenture.com");
		
	//To find the no:of links
		List<WebElement> links = driver.findElements(By.tagName ("a"));
//System.out.println("The total number of links in the webpage is" +links.size());
	
	//To Print the link name
		for (int i=0;i<links.size();i++) {
	System.out.println(links.get(i).getText()+"--------"+links.get(i).isDisplayed());
}

}
}

// To click on Register
// to click on Radiobutton.
//To add alert.