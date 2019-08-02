package devops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void launch() {
		driver.get("http://192.168.56.101:8011/addressbook/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
  @Test
  public void verifyaddbook() throws InterruptedException {
	  driver.findElement(By.xpath(("//div[@class='v-button v-widget']"))).click();
	  //Thread.sleep(5000);
	  driver.findElement(By.id("gwt-uid-18")).sendKeys("Edureka");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Devops");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("123456");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("05/05/1976");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	  //Thread.sleep(5000);
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
  }
  
}
