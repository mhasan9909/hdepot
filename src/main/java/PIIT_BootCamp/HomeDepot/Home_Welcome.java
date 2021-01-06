package PIIT_BootCamp.HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Welcome {
	public WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='My Account'])[1]") WebElement myAcct;
	@FindBy(xpath = "//*[@id=\"SPSORegister\"]/a/span") WebElement regNewAcct;

	
	public Home_Welcome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
public void newAccount() {
	
	WebElement  myAcct = driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));               
	Actions act=new Actions(driver);
	act.moveToElement(myAcct).click().build().perform();
}
public void acctRegist() {
	regNewAcct.click();

}
}
