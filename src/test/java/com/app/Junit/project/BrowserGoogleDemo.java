package com.app.Junit.project;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BrowserGoogleDemo {
	
WebDriver driver;
	
	@BeforeAll
	public void startbrowser()
	{
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}

	@DisplayName("BrowsergoogleDemo")
	@ParameterizedTest
	@CsvSource({
		"wikipedia"
	})
	

	public void Testmethod(String pagename) throws InterruptedException
	{
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(pagename);
        
        }
	public void testmethod2()
	{
		driver.findElement(By.id("voiceSearchButton")).click();
	}
	@AfterAll
	public void closebrowser()
	{
		driver.close();
	}
	
}





