package org.mac.HerokuInternetSampleFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void lauchBrowser() throws MalformedURLException{

		ChromeOptions options = new ChromeOptions();
		options.setCapability("platform", Platform.LINUX);
		
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), options);
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@AfterSuite
	public void killSession() {
		driver.quit();
	}

}
