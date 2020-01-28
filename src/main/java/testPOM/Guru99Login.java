package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {

	WebDriver driver;
	
	By userId = By.name("uid");
	By password = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");
	
	
	public Guru99Login(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void setUserName(String username)
	{
		driver.findElement(login).sendKeys(username);
	}
	
	public void  setPassword(String spassword)
	{
		driver.findElement(password).sendKeys(spassword);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}
	
	public String getLoginDetail() {
		return driver.findElement(titleText).getText();
	}
	
}
