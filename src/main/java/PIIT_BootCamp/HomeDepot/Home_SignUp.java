package PIIT_BootCamp.HomeDepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_SignUp {
public WebDriver driver;
	
	@FindBy(id  = "email") WebElement email;
	@FindBy(id = "password-input-field") WebElement pass;
	@FindBy(id = "companyName") WebElement cName;
	@FindBy(id = "firstName") WebElement fName;
	@FindBy(id = "lastName") WebElement lName;
	@FindBy(id = "proPhone") WebElement pNum;
	@FindBy(id = "proAddress") WebElement cAdd;
	@FindBy(id = "proZipCode") WebElement zCode;
    @FindBy(xpath="//*[@class='drop-down__select']")WebElement indType;
    @FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/div/div[1]/form/div[11]/div/div/div/div/iframe")WebElement iiFrame;


	
	
	
	
	public Home_SignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


}
	public void emailAdd(String emaill) {
		email.sendKeys(emaill);
	}
	
	public void pasWord(String pas) {
		pass.sendKeys(pas);
	}
	public void compName(String coname) {
		cName.sendKeys(coname);
	}
	public void firstName(String ffname) {
		fName.sendKeys(ffname);
	}
	public void lasttName(String llname) {
		lName.sendKeys(llname);
	}
	
	public void phNumm(String phh) {
		pNum.sendKeys(phh);
}
	public void copAdd(String adres) {
		cAdd.sendKeys(adres);
	}
	public void zipCode(String zipp) {
		zCode.sendKeys(zipp);
	}
	public void inDustry() {
		 indType.click();
		 indType.findElement(By.xpath("//option[@value='CARPENTRY']")).click();
		 indType.click();
	 }

		
}
