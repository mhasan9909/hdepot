package scriptRunner;

import org.testng.annotations.Test;

import PIIT_BootCamp.HomeDepot.Home_CreateAcct;
import PIIT_BootCamp.HomeDepot.Home_SignUp;
import PIIT_BootCamp.HomeDepot.Home_Welcome;
import hCommonMethods.RunTest;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class HomeTest extends RunTest {
	

  @Test
  public void f() throws InterruptedException  {
	  
	  Home_Welcome wh= new Home_Welcome(driver);
	  wh.newAccount();
	  wh.acctRegist();
	  
	  Home_CreateAcct hc=new Home_CreateAcct(driver);
	  hc.typeAcct();
	  hc.stCont();
	  
	  Home_SignUp sh=new Home_SignUp(driver);
	  sh.emailAdd("kirb@gmail.com");
	  sh.pasWord("dhsfkf@12244");
	  sh.compName("PeopleNtech");
	  sh.firstName("Faisal");
	  sh.lasttName("Hassan");
	  sh.phNumm("7127652234");
	  sh.copAdd("43 main st");
	  sh.zipCode("12601");
	  sh.inDustry();
	  
  }
  

 
  

}
