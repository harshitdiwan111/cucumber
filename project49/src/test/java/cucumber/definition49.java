package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.Registrationpageobject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definition49 {
	private WebDriver driver;
	private Registrationpageobject registrationpageobject ;

@Given("The user is on registration page")
public void the_user_is_on_registration_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training1\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm");
    driver.manage().window().maximize();
    registrationpageobject = new Registrationpageobject(driver);
}

   

@When("user enter all the details")
public void user_enter_all_the_details() {
	registrationpageobject.Registration("demo03", "demo", "Kumar", "demo123", "demo123", "Male", "demo01@gmail.com", "1234567890", "01/01/2000", "india", "anonyumus");
	
    
}

@When("user clicks on regsiter button")
public void user_clicks_on_regsiter_button() {
	//driver.findElement(By.name("Submit")).click();
    
}

@Then("user sucessfully navigate to home page")
public void user_sucessfully_navigate_to_home_page() {
	Assert.assertEquals("Login", driver.getTitle());
	driver.close();
   
}



}
