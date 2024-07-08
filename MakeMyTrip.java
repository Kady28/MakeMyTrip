package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMyTrip {
	WebDriver driver;


@When("navigate to url of makemytrip")
public void navigate_to_url_of_makemytrip() {
    // Write code here that turns the phrase above into concrete actions
	 driver = new ChromeDriver();
}

@When("enter location")
public void enter_location() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://www.makemytrip.com/hotels/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Hotels']")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='City, Property name or Location']")).click();
	   Thread.sleep(2000);
	   //driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div[1]")).sendKeys("munnar");
	   driver.findElement(By.id("checkin")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[1]")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[4]")).click();
	   driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Price per Night']")).click();
	   driver.findElement(By.xpath("//li[contains(text(),'₹2500-₹5000')]")).click();
	   driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//label[@for='city']")).click();
	   driver.findElement(By.xpath("//label[@for='city']")).sendKeys("munnar");
	   
	   
}

@When("click on search")
public void click_on_search() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("validate result")
public void validate_result() {
    // Write code here that turns the phrase above into concrete actions
    
}


}
