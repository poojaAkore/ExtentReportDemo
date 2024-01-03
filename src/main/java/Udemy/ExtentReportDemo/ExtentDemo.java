package Udemy.ExtentReportDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {
	ExtentReports extent;

@BeforeTest
public void config()
{
//ExtentReport & Extentsparkreporter
	
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Result");
	reporter.config().setDocumentTitle("Test Result");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Poojapatwari");
	

}

	
	
@Test
public void intialDemo()
{
	ExtentTest test=extent.createTest("intialDemo");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajinkya\\Desktop\\Driver\\chromedriver-win32\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/");
driver.getTitle();
driver.close();
}
}
