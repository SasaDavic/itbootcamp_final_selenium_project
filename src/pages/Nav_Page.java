package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Nav_Page {

	private WebDriver driver;

	public Nav_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHomeLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' Home ')]"));
	}
	
	public WebElement getAboutLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' About ')]"));
	}
	
	public WebElement getLoginLink() {
		return driver.findElement(By.className("btnLogin"));
	}
	
	public WebElement getSignUpLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' Sign Up ')]"));
	}
	
	public WebElement getLanguageButton() {
		return driver.findElement(By.xpath("//*[@class = 'btnLocaleActivation v-btn v-btn--text theme--light v-size--default']"));
	}
	
	public WebElement getENLanguageButton() {
		return driver.findElement(By.className("btnEN"));
	}

	public WebElement getESLanguageButton() {
		return driver.findElement(By.className("btnES"));
	}

	public WebElement getFRLanguageButton() {
		return driver.findElement(By.className("btnFR"));
	}

	public WebElement getCNLanguageButton() {
		return driver.findElement(By.className("btnCN"));
	}

	public WebElement getUALanguageButton() {
		return driver.findElement(By.className("btnUA"));
	}
	
	///kada se korisnik uloguje
	
	public WebElement getMyProfileLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' My Profile ')]"));
	}
	
	public WebElement getAdminLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' Admin ')]"));
	}
	
	public WebElement getCitiesLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), 'Cities')]"));
	}
	
	public WebElement getUsersLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), 'Users')]"));
	}
	
	public WebElement getLogoutLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), 'Logout')]"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.tagName("h1"));
	}
	
}
