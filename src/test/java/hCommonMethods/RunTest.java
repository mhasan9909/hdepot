package hCommonMethods;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class RunTest {
	public WebDriver driver;
	
	

	@Parameters({ "browser", "URI" })

	@BeforeClass
	public void beforeClass(String browser, String URI) {
		// webBrowser("Chrome", "https://www.facebook.com/");
		if (browser.equalsIgnoreCase("Chrome")) {
			String userDirectory = System.getProperty("user.dir");
			System.out.println(userDirectory);
			System.setProperty("webdriver.chrome.driver", userDirectory + "/chromedriver");
			// System.setProperty("webdriver.chrome.driver",
			// "{{/Users/mdhasan/eclipse-workspace/selnum}}/chromedriver-1");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URI);
			driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			String userDirectory = System.getProperty("user.dir");
			// System.out.println(userDirectory);
			System.setProperty("webdriver.gecko.driver", userDirectory + "/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(URI);
			driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();

		}
	}

	@AfterClass
    public void afterClass() {
		
	}
	



}
