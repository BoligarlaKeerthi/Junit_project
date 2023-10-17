package com.app.Junit.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BrowserfacebookDemo {
	
WebDriver driver;
	
	@BeforeAll
	public void startbrowser()
	{
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	@DisplayName("BrowserDemo")
	@ParameterizedTest
	@CsvSource({
		"admin,admin@123"
	})
	

	public void Testmethod(String username, String pwd) throws InterruptedException
	{
        driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(pwd);
	}
	
	@AfterAll
	public void closebrowser()
	{
		driver.close();
	}
	
}


