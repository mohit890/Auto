package mavenProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbcTest {
	
	WebDriver driver;
	public String baseurl = "https://www.amazon.in/";
	
	@Test
	public void methodOne() 
	{
		System.out.println("Wel-come to Maven");
	}
	
	@Test
	public void methodTwo() 
	{
		System.out.println("Method Two");
	}
	
	
	@BeforeMethod
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Browser_drivers\\Chrome_driver New\\chromedriver.exe");
		System.out.println("Launch Browser");
	}
	
	@Test
	public void GetUrl()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Launch Chrome : Amazone.in");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//driver.close();
	}
	
	@BeforeMethod
	public void BrowserLaunchEdge()
	{
		System.setProperty("webdriver.edge.driver","E:\\Browser_drivers\\Edge\\msedgedriver.exe");
		System.out.println("Launch Edge Browser");
	}
	
	@Test
	public void GetEdgeUrl()
	{
		driver = new EdgeDriver();
		driver.get(baseurl);
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Launch Edge : Amazone.in");
	}
	
	@AfterMethod
	public void edgeafterMethod()
	{
		//driver.close();
	}
	
	@BeforeMethod
	public void BrowserLaunchFirefox()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Browser_drivers\\Firefox 27\\geckodriver.exe");
		System.out.println("Launch FireFox Browser");
	}
	
	@Test
	public void GetFirefoxUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseurl);
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Launch Firefox : Amazone.in");
	}
	
	@AfterMethod
	public void firefoxafterMethod()
	{
		//driver.close();
	}

	
	/*@Test
	public void methodOne() 
	{
		System.out.println("Wel-come to Maven");
	}
	
	@Test
	public void methodTwo() 
	{
		System.out.println("Method Two");
	}*/

}
