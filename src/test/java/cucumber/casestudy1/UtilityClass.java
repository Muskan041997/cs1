package cucumber.casestudy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityClass {
	static WebDriver driver;

	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
