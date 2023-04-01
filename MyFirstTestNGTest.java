package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	WebDriver driver;
  @Test
  public void nTLoginTest() throws InterruptedException {
	  Thread.sleep(5000);
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		//click on submit button
		
		username.submit();
		//validate
		Thread.sleep(5000);
		String expectedpagetitle="OrangeHRM";
		String actualpagetitle= driver.getTitle();
		System.out.println(actualpagetitle);
		/*
		 * if(expectedpagetitle.equals(actualpagetitle)) {
		 * System.out.println("test case passed"); }else {
		 * System.out.println("test case failed"); }
		 */
		assertEquals(actualpagetitle,expectedpagetitle );
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside after class");

  }

}
