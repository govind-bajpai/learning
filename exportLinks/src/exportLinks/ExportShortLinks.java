package exportLinks;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExportShortLinks {
//	public static final String userName="gbajpai";
//	public static final String password ="Patanahi**2";
//	public static final String domain="org";
//	public static final String url = "https://www.bakker.com/INTERSHOP/web/WFS/SLDSystem";
//	public static final String byPassURL = "https://www.bakker.com/INTERSHOP/web/WFS/org-Site/nl_NL/b2c/EUR/ViewChannelLinkImpex-Status?ChannelID=nLcKCQEPidIAAAFR4ThljiVn";
	
	public static final String userName="admin";
	public static final String password ="intershop";
	public static final String domain="org";
	public static final String url = "https://localhost/INTERSHOP/web/WFS/SLDSystem";
	public static final String byPassURL = "https://localhost/INTERSHOP/web/WFS/org-Site/nl_NL/b2c/EUR/ViewChannelLinkImpex-Status?ChannelID=nLcKCQEPidIAAAFR4ThljiVn";
	
	
	public static final String byPasssUrlAcc ="https://acc.bakker.com/INTERSHOP/web/WFS/org-Site/en_GB/b2c/EUR/ViewChannelLinkImpex-Status?ChannelID=nLcKCQEPidIAAAFR4ThljiVn";

	public static void main(String[] args) throws InterruptedException {

		int j;
		File gecko = new File("E:\\Bakker Issues\\BAKTicket\\New folder\\Geko_Win\\geckodriver.exe");   
		System.out.println(gecko.getAbsolutePath());
		
    	System.setProperty("webdriver.gecko.driver", gecko.getAbsolutePath());
    	WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); driver.manage().window().maximize(); driver.manage().deleteAllCookies(); System.out.println("browser openned"); 
	
		driver.get(url);
		WebElement login = driver.findElement(By.id("LoginForm_Login"));
		login.sendKeys(userName);
		WebElement passwordInput = driver.findElement(By.id("LoginForm_Password"));
		passwordInput.sendKeys(password);
		WebElement domainName = driver.findElement(By.id("LoginForm_RegistrationDomain"));
		domainName.sendKeys(domain);
		
		WebElement loginButton = driver.findElement(By.name("submit"));
		loginButton.click();

		driver.get(byPassURL);
		WebElement element = driver.findElement(By.name("LinkExport"));
	    element.click();
	    driver.findElement(By.name("PageSize_50")).click();
	    Thread.sleep(3000);
	   // int 905
	    for(int i=1;i<=1110 ;i++) {
	    	if(i%5==0) {
	    		driver.findElement(By.name("PageNumber_"+i)).click();
	    		Thread.sleep(300);
	    	}
//	    	if(i==552) {
//	    		driver.findElement(By.name("PageNumber_552")).click();
//	    		Thread.sleep(300);
//	    		
//	    	}
	    }
	   
	    
	    
	    
	    for(int i=1;i<=72;i++) {
	    	driver.findElement(By.linkText("Select All")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@value='Next']")).click();
	    	Thread.sleep(5000);
	    }	
	    
	    driver.findElement(By.linkText("Select All")).click();
    	Thread.sleep(1000);
    	
    	 driver.findElement(By.name("exportSelected")).click();
 	    Thread.sleep(2000);
 	    driver.findElement(By.name("ShortLinkExportForm_ExportFile")).sendKeys("export8.csv");
 	    driver.findElement(By.name("StartLinkExport")).click();
	    
//	    driver.findElement(By.linkText("Select All")).click();
//    	Thread.sleep(1000);
//	    driver.findElement(By.xpath("//input[@value='Next']")).click();
//	    driver.findElement(By.linkText("Select All")).click();
//	    Thread.sleep(1000);
    }
}
