package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver.get("https://www.hotstar.com/in/movies/love-pannunga-life-nalla-irukkum/1260016671");
	    
	}

	@When("^Search the vidyavox songs$")
	public void search_the_vidyavox_songs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//input[@id='search']
		
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Vidyavox");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(@to,'love-pannunga')])[2]"))));
		driver.findElement(By.xpath("(//a[contains(@to,'love-pannunga')])[2]")).click();
		
		driver.manage().window().maximize();
		
	    
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
