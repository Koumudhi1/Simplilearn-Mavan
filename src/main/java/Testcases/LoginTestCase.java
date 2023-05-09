package Testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import Pages.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase extends Baseclass {
	
	@Test
	public void test1() { 
		
	
		Loginpage login = new Loginpage(driver);
		login.LoginFunction("abc@xyz.com","Abc@1234");
		
   
        
	}
		
		
	

	@Test
	public void test2() {
	
		Loginpage login= new Loginpage(driver);
		login.LoginFunction("pqr@xyz.com","Abc@1235");
		
		
	}
	
	@Test
	public void test4() throws FilloException {
		
		Recordset recordset = connection.executeQuery("select * from data where TestName='test4'");
		recordset.next();
			
		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");
		
		Loginpage login = new Loginpage(driver);
		login.LoginFunction(UserName, Password);

	
	}
	

		

}