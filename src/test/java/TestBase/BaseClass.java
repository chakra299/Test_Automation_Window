package TestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass	
	
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		System.out.println("BaseClass setup executed");

	}

	@AfterClass
	public void tearDown() {
		// driver.close();
	}

	public String randomeString() {

		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;

	}

	public String randomeNumber() {

		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	public String randomeAlphaNuberic() {

		String generatedstring = RandomStringUtils.randomAlphabetic(4);
		String generatedAlphaNumeric = RandomStringUtils.randomNumeric(4);

		return (generatedstring + "@" + generatedAlphaNumeric);
	}
	
	
	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("https://tutorialsninja.com/demo/");
	//driver.manage().window().maximize();

}
