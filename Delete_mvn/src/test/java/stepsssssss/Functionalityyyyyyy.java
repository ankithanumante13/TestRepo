package stepsssssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Functionalityyyyyyy {
	WebDriver driver;
	@Given("browser must be opened and url must be launched")
	public void browser_must_be_opened_and_url_must_be_launched() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https:/www.facebook.com");
	   
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello");
	   
	}

	@Then("Succesfully login")
	public void succesfully_login() {
		System.out.println("Succefully login");
	   
	}

}
