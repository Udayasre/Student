package com.udaya.maven.Student;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class showClose {
	
	
	@Test 
	
	public void test() throws InterruptedException { 
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest1 executed"); 
	Thread.sleep(2000); 
	System.out.print("junittest1 class is executed"); 
	driver.quit(); 
	} 
}
