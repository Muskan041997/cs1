package cucumber.casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
//import cucumber.demo.UtilityClass;

public class SignUp {
	WebDriver driver;
	Select sel;
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		   
	}

	@When("^user gives the \"([^\"]*)\"$")
	public void user_gives_the(String arg1) throws Throwable {
		driver.findElement(By.linkText("SignUp")).click(); 
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(arg1);
	}

	@When("^firstname \"([^\"]*)\"$")
	public void firstname(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(arg1);
	}

	@When("^lastname \"([^\"]*)\"$")
	public void lastname(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(arg1);
	}

	@When("^password \"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(arg1);
	}

	@When("^confirm \"([^\"]*)\"$")
	public void confirm(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(arg1);
	}

	@When("^user selects gender$")
	public void user_selects_gender() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}
	@When("^email \"([^\"]*)\"$")
	public void email(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(arg1);
	}
	
	
@When("^mobileNo \"([^\"]*)\"$")
public void mobileno(String arg1) throws Throwable {
   driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(arg1);
}

	@When("^dob \"([^\"]*)\"$")
	public void dob(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(arg1);
	}

	@When("^address \"([^\"]*)\"$")
	public void address(String arg1) throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(arg1);
	}

	@When("^question$")
public void question() throws Throwable {
		sel=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		sel.selectByIndex(1);
}

	@When("^answer \"([^\"]*)\"$")
	public void answer(String arg1) throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(arg1);
	}

	@Then("^user must in home page and display success message$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
	   driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	   Assert.assertEquals(driver.getTitle(), "Login");
	   driver.close();
	   System.out.println("Registration successgfull!!!");
	}

}
