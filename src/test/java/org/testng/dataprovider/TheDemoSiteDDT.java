package org.testng.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheDemoSiteDDT {

	WebDriver driver;

	@BeforeTest

	public void openDemoSite() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/aydin/Documents/Libraries/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://thedemosite.co.uk/addauser.php");
	}

	@Test(dataProvider = "Credentials")

	public void demoSiteCoUkDDT(String userName, String password) {
		driver.findElement(By.name("username")).sendKeys(userName);
		password = password.substring(0, 8);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("FormsButton2")).click();
	}

	@DataProvider(name = "Credentials")

	public Object[][] generateCredentials() {

		Object[][] employees = new Object[4][3];

		employees[0][0] = new String("Mike");
		employees[0][1] = "mike@gmail.com";
		employees[0][2] = "IT_Prog";

		employees[1][0] = "Steven";
		employees[1][1] = "steven@gmail.com";
		employees[1][2] = "Tester";

		employees[2][0] = "Sarah";
		employees[2][1] = "sarah@gmail.com";
		employees[2][2] = "HR Rep";

		employees[3][0] = "Kevin";
		employees[3][1] = "kevin@gmail.com";
		employees[3][2] = "Dev";

		return employees;
	}

}
