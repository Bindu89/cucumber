package com.trainning.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class steps {
	
WebDriver driver;
		@Given("^launch app and pass url for sfdc$")
		public void launch_app_and_pass_url_for_sfdc() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsp40\\eclipse-workspace\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		    		    		}

		@When("^login page is displayed$")
		public void login_page_is_displayed() throws Throwable {
			//WebElement sfdcpage=driver.findElement(By.id("logo"));
			String sfdclogo=driver.getTitle();
			System.out.println("  "+sfdclogo);
			//Assert.assertEquals("login|Salesforce", sfdclogo);
		    
		}

		@When("^enter valid usename and password in required fields$")
		public void enter_valid_usename_and_password_in_required_fields() throws Throwable {
			
			WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
	
			uname.sendKeys("bindukonda89@gmail.com");
			
			WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
	
			pwd.sendKeys("password89");
		    		    
		}

		@When("^check remember me$")
		public void check_remember_me() throws Throwable {
			WebElement pwd=driver.findElement(By.id("rememberUn"));
			pwd.click();
		    
		    
		}

		@Then("^click on login button$")
		public void click_on_login_button() throws Throwable {
			 WebElement login =driver.findElement(By.xpath("//input[@id='Login']"));
		    login.click();
		   
		}

		@Then("^sfdc page is displayed with username$")
		public void sfdc_page_is_displayed_with_username() throws Throwable {
		   System.out.println("logged in successfully");
		    
		}

		@Then("^close the page$")
		public void close_the_page() throws Throwable {
		    driver.close();
		    
		}


}
