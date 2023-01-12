package Flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_flow {

	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void testHomageFlow() throws Exception {

		driver.get("https://apply.homage.sg/");
		driver.findElement(By.xpath("//input[@id='firstName']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Mukesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("CR");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("crkumarmukesh@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Select country']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li/span[text()='India']"))
				.click();

		driver.findElement(By.xpath("//input[@id='phone']")).clear();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+91 74111-78856");

		driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'No')])[2]")).click();

		driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[3]")).click();
		// How many years of professional healthcare experience do you have?

		driver.findElement(By.xpath("(//button)[9]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Enrolled Nurse (EN)']")).click();

//How many years of professional healthcare experience do you have?

		driver.findElement(By.xpath("//button[contains(.,'Home Care')]")).click();

		// full time
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Freelance')]")).click();

		// BAckground check
		driver.findElement(By.xpath("(//button[contains(@class,'cpf-box cpf-btn')][normalize-space()='No'])[4]"))
				.click();

		driver.findElement(By.xpath("//div[@id='source']")).click();

		driver.findElement(By.cssSelector("li:nth-child(2)")).click();

		driver.findElement(By.xpath(" //input[@id='declarationName']")).click();
		driver.findElement(By.xpath(" //input[@id='declarationName']")).sendKeys("Mukesh CR");

		driver.findElement(By.xpath("//div[@class='h cpf-checkbox mb-0 ']//i")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Submit Application']")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
