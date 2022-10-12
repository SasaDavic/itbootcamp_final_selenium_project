package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page {

	private WebDriver driver;
	
	public login_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailInput() {
		return driver.findElement(By.id("email"));		
	}
	
	public WebElement getPasswordInput() {
		return driver.findElement(By.id("password"));		
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[@type = 'submit']"));		
	}
	
	
	
	
	
	
	
	
	
	
	
}
