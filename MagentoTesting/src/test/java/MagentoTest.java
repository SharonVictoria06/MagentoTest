

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest {
	@Test
	public  void positiveCred() {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
	
		Login l=new Login(driver);
		l.enterEmail("sharonvictoria0692@gmail.com");
		l.enterPassword("welcome@12345");
		l.clickOnLogin();
		
		MyAccount m=new MyAccount(driver);
		m.clickOnLogout();
		
		
		
		
		
		
	}

}
