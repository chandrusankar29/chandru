package stepDefention;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class testCase {
	   ChromeDriver driver;
	@Given("I want to send an email")
	public void i_want_to_send_an_email() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://mail.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("chandru.sankar29@gmail.com");
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector("div[id='identifierNext'] > div >button > span")).click();
	    driver.findElement(By.id("input[name='password']")).sendKeys("Madhavaram@51");
	    driver.findElement(By.cssSelector("div[id='identifierNext'] > div >button > span")).click();
	    driver.findElement(By.cssSelector("//div[text()='Compose']")).click();
	}

	@When("Add receipent")
	public void add_receipent() {
		driver.findElement(By.cssSelector("input[id=':ts']")).sendKeys("chandru.sankar29@gmail.com");
	}

	@When("Add Subject")
	public void add_subject() {
		driver.findElement(By.cssSelector("input[id=':q6']")).sendKeys("AutomationScript");
		
	}

	@Then("Add text in content area")
	public void add_text_in_content_area() {
		driver.findElement(By.id("#\\:rg")).sendKeys("This is the email body of this email. Contains some text");
	}

	@Then("Click send button")
	public void click_send_button() {
		driver.findElement(By.id("div[id=':pw']")).click();
	}
    
	
	
}