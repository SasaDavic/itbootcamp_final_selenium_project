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
		return driver.findElement(By.xpath("//*[ contains (text(), ' Login ')]"));
	}
	
	public WebElement getSignUpLink() {
		return driver.findElement(By.xpath("//*[ contains (text(), ' Sign Up ')]"));
	}
	
	public WebElement getLanguageButton() {
		return driver.findElement(By.xpath("//*[@class = 'btnLocaleActivation v-btn v-btn--text theme--light v-size--default']"));
	}
	
	Select drpLanguage = new Select (driver.findElement(By.xpath("//*[@class = 'btnLocaleActivation v-btn v-btn--text theme--light v-size--default']")));
	
	public void getLanguageButtonEn() {	
		drpLanguage.selectByVisibleText(" en ");
	}

	public void getLanguageButtonEs() {	
		drpLanguage.selectByVisibleText(" es ");
	}
	
	public void getLanguageButtonFr() {	
		drpLanguage.selectByVisibleText(" fr ");
	}
	
	public void getLanguageButtonCn() {	
		drpLanguage.selectByVisibleText(" cn ");
	}
	
	public void getLanguageButtonUa() {	
		drpLanguage.selectByVisibleText(" ua ");
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
	
	
	
}
