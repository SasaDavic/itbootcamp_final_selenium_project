package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CitiesPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public WebElement getNewItemButton() {
		return driver.findElement(By.xpath("//*[@class= 'text-right']/button"));
	}

	public WebElement getInputSearch() {
		return driver.findElement(By.id("search"));
	}
	
	public void waitForDialogNewEditToBeVisible() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class= 'v-dialog dlgNewEditItem v-dialog--active']")));			
	}
	
	public void waitForDialogDeleteToBeVisible() {
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("v-card v-sheet theme--light rounded-0")));			
	}
	
	public WebElement getNewEditDialogInput() {
		return this.driver.findElement(By.name("name"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@class= 'btnSave v-btn v-btn--text theme--light v-size--default green--text text--lighten3']"));
	}
	
	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@class= 'v-btn v-btn--text theme--light v-size--default red--text text--lighten3']"));
	}
	
	public void waitForNumbersOfCitiesRows ( int rows) {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//table/tbody//tr"), rows));
	}
	
	public WebElement getCellFromRow(int row, int col) {
		return driver.findElement(By.xpath("//table/tbody//tr[" + row + "]/td[" + col + "]"));
	}
	
	public WebElement getEditButtonFromRow(int row) {
		return driver.findElement(By.xpath("//table/tbody//tr[" + row + "]//button[@id='edit']"));
	}
	
	public WebElement getDeleteButtonFromRow(int row) {
		return driver.findElement(By.xpath("//table/tbody//tr[" + row + "]//*[@id='delete']"));
	}
	
	
	
	
}
