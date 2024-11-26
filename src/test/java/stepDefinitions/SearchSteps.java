package stepDefinitions;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Robot;

public class SearchSteps {
	WebDriver driver;
	
	@Given("I am on the ESPNcricinfo homepage")
	public void i_am_on_the_esp_ncricinfo_homepage() {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();

	}

	@When("I enter {string} in the search bar")
	public void i_enter_in_the_search_bar(String string) {
		WebElement searchBar = driver.findElement(By.cssSelector("input[class*='search-box']"));
        searchBar.sendKeys(string);
        driver.findElement(By.xpath("//i[contains(@class,'icon-search-')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search Players')]")).sendKeys("Virat Kholi");
		//Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
        
	}

	@When("I press Enter")
	public void i_press_enter() {


	}

	@Then("I should see relevant search results")
	public void i_should_see_relevant_search_results() {


	}

	@Then("the results should include match details or articles related to {string}")
	public void the_results_should_include_match_details_or_articles_related_to(String string) {


	}

}
