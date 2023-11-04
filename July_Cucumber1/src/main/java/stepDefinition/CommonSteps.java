package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;
import io.cucumber.java.en.When;

public class CommonSteps extends TestBase {
		private TestBase tbase;
		public CommonSteps(TestBase tbase) {
		this.tbase=tbase;
}
	@When("I enter  username as {string}")
	public void i_enter_username_as(String string) {
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(string);
		System.out.println("I enter  username as {string}");
	}
	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(string);
		System.out.println("I enter password as {string}");
	}
}
