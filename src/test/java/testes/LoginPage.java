package testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//Locators 
	private By txt_username = By.xpath("//input[@placeholder='Username']");
	private By txt_password = By.xpath("//input[@placeholder='Password']");
	private By btn_login = By.xpath("//button[normalize-space()='Login']");

//Action methods
	public void setUserName(String user) {
		driver.findElement(txt_username).sendKeys(user);
	}

	public void setPassword(String pwd) {
		driver.findElement(txt_password).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

}