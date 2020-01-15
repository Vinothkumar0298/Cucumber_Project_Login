package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^open the browser and launch the url\\.$")
	public void open_the_browser_and_launch_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Learnings\\Eclipse_WS\\Login\\src\\SeleniumAPIs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://youtube.com");
	    
	}

	@When("^Search the vidyavox songs$")
	public void search_the_vidyavox_songs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//input[@id='search']
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vidyavox");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
	    
	}

	@When("^Click the least song links$")
	public void click_the_least_song_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@id='img'])[69]")).click();
	    
	}

	@Then("^play the song$")
	public void play_the_song() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
