package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePopUpPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void waitForMessagePopUpPageToBeVisible() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'v-snack__content']")));
	}
	
	public WebElement getTextFromMessagePopUp() {
		return driver.findElement(By.xpath("//*[@class = 'v-snack__content']/ul/li"));
	}
	
	public WebElement getCloseButtonFromMessagePopUp() {
		return driver.findElement(By.xpath("//*[@class = 'v-snack__content']/button"));
	}
	
	public void waitForVerifyYourAccountToBeVisible() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'v-card v-sheet theme--light']")));
	}
	
	public WebElement getTextFromVerifyYourAccount() {
		return driver.findElement(By.xpath("//*[@class = 'v-card v-sheet theme--light']/div"));
	}
	
	public WebElement getCloseButtonFromVerifyYourAccount() {
		return driver.findElement(By.xpath("//*[@class = 'v-card v-sheet theme--light']/div[3]/button"));
	}
	
	
	
	
	
}
