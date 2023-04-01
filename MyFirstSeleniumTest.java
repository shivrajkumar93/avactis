package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Steps 
		// open browser
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// webdriver is an interface
		//naviagte to https://nichethyself.com/tourism/home.html
		driver.get("https://nichethyself.com/tourism/home.html");
		//enter credential
		//below 2 lines in case if we are willing to reuse it.
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("stc123");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("12345");
		//click on submit button
		
		username.submit();
		//validate
		Thread.sleep(5000);
		String expectedpagetitle="My account";
		String actualpagetitle= driver.getTitle();
		System.out.println(actualpagetitle);
		if(expectedpagetitle.equals(actualpagetitle))
		{
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
	}

}
