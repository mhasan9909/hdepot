package PIIT_BootCamp.HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_CreateAcct {
public WebDriver driver;
	
	@FindBy(xpath = "(//*[@type='button'])[4]") WebElement acctType;
	@FindBy(xpath = "//*[text()='Select & Continue']") WebElement sltCont;

	
	public Home_CreateAcct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void typeAcct() {
		acctType.click();
	}
	public void stCont() {
		sltCont.click();
	}
}
