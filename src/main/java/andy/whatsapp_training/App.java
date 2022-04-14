package andy.whatsapp_training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	//Public WebDriver driver ;
    public static void main( String[] args ) throws IOException
    {
    	
//    	System.out.println(System.getProperty("user.dir")) ;
//
//    	Properties prop = new Properties();
//    	String prPath = System.getProperty("user.dir");
//    	FileInputStream fis = new FileInputStream(prPath+"\\src\\main\\java\\andy\\whatsapp_training\\data.properties");
////    	C:\Users\andy7\eclipse-workspace_new\whatsapp-training
//    	prop.load(fis);
//    	String browser = prop.getProperty("browser");
//    	System.out.println(browser);
//
//    	String url = prop.getProperty("url");
//		System.out.println(url);
//		if(browser.equals("chrome")) {
//		
//			System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
//			driver = new ChromeDriver();
//			System.out.println(browser);
//			
//			
//		} else if (browser.equals("firefox")) {
//			
//			System.setProperty("webdriver.gecko.driver", "c:\\webdriver\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			
//		} else if (browser.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", "c:\\webdriver\\msedgedriver.exe");
//			driver = new EdgeDriver();
//		}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get(url);
    }
}
