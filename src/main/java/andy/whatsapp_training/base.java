package andy.whatsapp_training;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public String url;
	public String contactFile;
	
	
	public WebDriver initDriver() throws IOException {
		System.out.println(System.getProperty("user.dir")) ;

    	Properties prop = new Properties();
    	String prPath = System.getProperty("user.dir");
    	FileInputStream fis = new FileInputStream(prPath+"\\src\\main\\java\\andy\\whatsapp_training\\data.properties");
//    	C:\Users\andy7\eclipse-workspace_new\whatsapp-training
    	prop.load(fis);
    	String browser = prop.getProperty("browser");
    	System.out.println(browser);

    	url = prop.getProperty("url");
    	contactFile = prPath+"\\in\\"+prop.getProperty("contacts");
		System.out.println(url);
		if(browser.equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", prPath+"\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println(browser);
			
			
		} else if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", prPath+"\\webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", prPath+"\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;

	}
	
	public String getName() throws IOException {
		Properties prop = new Properties();
    	String prPath = System.getProperty("user.dir");
    	FileInputStream fis = new FileInputStream(prPath+"\\src\\main\\java\\andy\\whatsapp_training\\data.properties");
    	prop.load(fis);
    	return prop.getProperty("name");
	}


}
