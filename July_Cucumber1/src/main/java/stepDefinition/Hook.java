package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hook {
	private TestBase base;
	public Hook(TestBase base) {
		this.base=base;
	

	}
	@Before
	public void InitializeTest(Scenario scenario) {
		
	base.driver = new ChromeDriver();
	base.driver.get("https://www.browserstack.com/");
	base.driver.manage().window().maximize();
	base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void TearDownTest(Scenario scenario) {
		if (scenario.isFailed()) {
			//Take Screenshot logic goes here
			System.out.println(scenario.getName());
		}
		System.out.println("Closing the browser");
		base.driver.quit();
	}
		@BeforeStep
		public void BeforeEveryStep(Scenario scenario) {
		System.out.println("Before every step" + scenario.getId());
		}
		
		@AfterStep
		public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException,IllegalAccessException {
		
			System.out.println("After every step" + scenario.getId());
		}
}

			
			
			
			
			
			
			
			
			
			
			
			
			
		
	