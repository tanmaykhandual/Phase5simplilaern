package com.selenium.resistrationlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registraion_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\simplilearn java\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement email = driver.findElement(By.name("sView1:r1:0:email"));
		WebElement pass = driver.findElement(By.name("sView1:r1:0:password"));
		WebElement repass = driver.findElement(By.name("sView1:r1:0:retypePassword"));
		Select drpCountry = new Select(driver.findElement(By.name("sView1:r1:0:country")));
		drpCountry.selectByVisibleText("India");
		WebElement fname = driver.findElement(By.name("sView1:r1:0:firstName"));
		WebElement lname = driver.findElement(By.name("sView1:r1:0:lastName"));
		WebElement job = driver.findElement(By.name("sView1:r1:0:jobTitle"));
		WebElement phone = driver.findElement(By.name("sView1:r1:0:workPhone"));
		WebElement company = driver.findElement(By.name("sView1:r1:0:companyName"));
		WebElement address = driver.findElement(By.name("sView1:r1:0:address1"));
		WebElement city = driver.findElement(By.name("sView1:r1:0:city"));
		Select drpstate = new Select(driver.findElement(By.name("sView1:r1:0:state")));
		drpstate.selectByVisibleText("Odisha");
		WebElement post = driver.findElement(By.name("sView1:r1:0:postalCode"));
		
		email.sendKeys("tanmay@gmail.com");
		pass.sendKeys("12345678");
		repass.sendKeys("12345678");
		fname.sendKeys("Tanmay");
		lname.sendKeys("Khandual");
		job.sendKeys("Developer");
		phone.sendKeys("1234567890");
		company.sendKeys("simplilearn");
		address.sendKeys("odisha");
		city.sendKeys("Balasore");
		post.sendKeys("Balasore");
		
		WebElement createaccount = driver.findElement(By.className("xfp"));
		createaccount.click();
		
		driver.get("https://login.oracle.com/mysso/signon.jsp");
		WebElement uname = driver.findElement(By.id("sso_username"));
		WebElement password = driver.findElement(By.name("password"));
		uname.sendKeys("Tanmay");
		password.sendKeys("12345678");
		WebElement signin = driver.findElement(By.className("sign-in-button"));
		signin.click();
		
		
	}

}
