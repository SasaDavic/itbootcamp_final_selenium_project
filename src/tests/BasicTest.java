package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CitiesPage;
import pages.MessagePopUpPage;
import pages.Nav_Page;
import pages.SignupPage;
import pages.login_page;

public class BasicTest {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected String baseUrl = "https://vue-demo.daniel-avellaneda.com";
	protected login_page loginPage;
	protected Nav_Page navPage;
	protected SignupPage signupPage;
	protected CitiesPage citiesPage;
	protected MessagePopUpPage messagePopUpPage;
	
	@BeforeClass 
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		loginPage = new login_page(driver);
		navPage = new Nav_Page(driver);
		signupPage = new SignupPage(driver);
		citiesPage = new CitiesPage(driver, wait);
		messagePopUpPage = new MessagePopUpPage(driver, wait);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(baseUrl); 
	}
			
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		//gde se kreira screenshot stranice u slucaju da test ne prodje

	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
