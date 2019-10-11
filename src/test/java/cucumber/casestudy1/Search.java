package cucumber.casestudy1;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	WebDriver driver;
	

@Given("^Luanch the browser for product found$")
public void luanch_the_browser_for_product_found() throws Throwable {
	driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
}

@When("^user login$")
public void user_login() throws Throwable {
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	 Assert.assertEquals(driver.getTitle(), "Home");
}

@When("^search for product found$")
public void search_for_product_found() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Head");
    driver.findElement(By.name("products")).click();
    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
   // Assert.assertEquals(driver.getTitle(), "Search");
    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
    WebDriverWait wait=new  WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("radio1")));
    driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
    driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
    driver.findElement(By.linkText("SignOut")).click();
}

@Then("^Payment successfull$")
public void payment_successfull() throws Throwable {
   //Assert.assertEquals(driver.getTitle(), "Home");
   driver.close();
}

@Given("^Luanch the browser for product not found$")
public void luanch_the_browser_for_product_not_found() throws Throwable {
	driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
}


@When("^user login and product not found$")
public void user_login_and_product_not_found() throws Throwable {
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
	 Assert.assertEquals(driver.getTitle(), "Home");
}
@When("^search for product not found$")
public void search_for_product_not_found() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("ABC");
    driver.findElement(By.name("products")).click();
    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    Assert.assertEquals(driver.getTitle(), "Search");
}

@Then("^Payment unsuccessfull not found$")
public void payment_unsuccessfull_not_found() throws Throwable {
	driver.close();
}
	@Given("^Luanch the browser for product is blank$")
	public void luanch_the_browser_for_product_is_blank() throws Throwable {
		driver = UtilityClass.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
	}
	@When("^user login and product is blank$")
	public void user_login_and_product_is_blank() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		 Assert.assertEquals(driver.getTitle(), "Home");
	}
	@When("^search for product is blank$")
	public void search_for_product_is_blank() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^Payment unsuccessfull when blank$")
	public void payment_unsuccessfull_when_blank() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals("Home", driver.getTitle());
		driver.close();
	}
}
