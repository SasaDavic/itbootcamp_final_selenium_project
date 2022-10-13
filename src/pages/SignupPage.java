package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	
	private WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNameLink() {
		return driver.findElement(By.xpath("//*[@id = 'name']"));
	}
	
	public WebElement getEmailLink() {
		return driver.findElement(By.xpath("//*[@id = 'email']"));
	}
	
	public WebElement getPasswordLink() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmPasswordLink() {
		return driver.findElement(By.id("confirmPassword"));
	}
	
	public WebElement getSignMeUpButton() {
		return driver.findElement(By.xpath("//*[ contains (text(), 'Sign me up')]"));
	}
	
}
