
package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Step extends TestBase {
	private TestBase tbase;
	public login_Step(TestBase tbase) {
		this.tbase=tbase;
	}
	@Given("I am on Browserstack home page")
	public void i_am_on_browserstack_home_page() {
	System.out.println("I am on Browserstack home page");
	    
	}
	@When("I am click on login button")
	public void i_am_click_on_login_button() {
		driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();
		System.out.println("I am click on login button");
	}
	@Then("I navigate to Login In page")
	public void i_navigate_to_login_in_page() {
		System.out.println(driver.getTitle());
	    System.out.println("I navigate to Login In page");
	}
	@When("I enter  username as uddhavhivare@gmial.com")
	public void i_enter_username_as_uddhavhivare_gmial_com() {
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("uddhavhivare@gmail.com");
	    System.out.println("I enter  username as uddhavhivare@gmial.com");
	}
	@When("I enter password as Uddhav@123")
	public void i_enter_password_as_Uddhav_123() {
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Uddhav@123");
	   System.out.println("I enter password as Uddhav@123");
	}
	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		WebElement LoginBtn=driver.findElement(By.xpath("//input[@id='user_submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", LoginBtn);
		System.out.println("I click on the Login button");
	}
	@Then("user navigate  to Dashboard page")
	public void user_navigate_to_dashboard_page() {
	    System.out.println("user navigate  to Dashboard page");
	}
	@Then("user display browserstack dashboard")
	public void user_display_browserstack_dashboard() {
	   System.out.println("user display browserstack dashboard");
	}

@When("I enter  username as uddhavhivare1@gmial.com")
public void i_enter_username_as_uddhavhivare1_gmial_com() {
	driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("uddhavhivare1@gmail.com");
}
@When("I enter password as Uddhav@1234")
public void i_enter_password_as_uddhav_1234() {
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Uddhav@1234");
}
@Then("user display error message as please enter vaild username password")
public void user_display_error_message_as_please_enter_vaild_username_password() 
{
	
}
	@When("The user credentials are wrong")
	public void the_user_credentials_are_wrong() {
	   System.out.println("The user credentials are wrong");
	   WebElement invPass= driver.findElement(By.xpath("//span[text()='Invalid password']"));
	   invPass.isDisplayed();
} 


}
